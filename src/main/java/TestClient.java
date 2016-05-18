import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.*;
import io.swagger.client.model.*;

/**
 * Simple test client to test the node preferences api
 *
 * @author Michallis Pashidis
 * @author Maarten Casteels
 */
public class TestClient {

    private static Logger _LOG = Logger.getGlobal();
    private static Gson gson;

    static {
        gson = new Gson();
    }

    public TestClient() { }

    public static void main(final String... args) {
        final TestClient tc = new TestClient();
        //ApiClient apiClient = tc.createApiClient("9ef64835-7d68-4ae8-b6ec-5df25aec186f","https://api-gw-o.antwerpen.be/acpaas/userprefs/v1");
        //ApiClient apiClient = tc.createApiClient("5c044f41-3836-4a28-9809-823ce04481ca","https://devprefapi.t1t.be/api/v1");//http://localhost:3001/api/v1
        final ApiClient apiClient = tc.createApiClient("5c044f41-3836-4a28-9809-823ce04481ca", "http://localhost:3001/api/v1/");
        tc.execUC1(apiClient);
    }

    /**
     * CheckMK use case
     *
     * @param apiClient as a client
     */
    private void execUC1(final ApiClient apiClient) {
        _LOG.log(Level.INFO, "Execute User Case 1");
        _LOG.log(Level.INFO, "-------------------");
        try {
            //SOFT COMP
            final SoftwareComponent softCompSC01A = createSoftwareComponent(apiClient, "Application", "t1t-dummy-sc01", "", "v1");
            //LANG
            final SupportedLanguage lang01 = createLanguage(apiClient, "nl-BE");
            final SupportedLanguage lang02 = createLanguage(apiClient, "fr-BE");
            final SupportedLanguage lang03 = createLanguage(apiClient, "en-EN");
            //CHANNELS
            final SupportedCommChannel channel01 = createChannel(apiClient, "SMS");
            final SupportedCommChannel channel02 = createChannel(apiClient, "EMAIL");
            final SupportedCommChannel channel03 = createChannel(apiClient, "SOCKET");
            //THEMA
            final Theme theme01 = createTheme(apiClient, "Themesc01A", "Theme for sc01-A");
            final Theme theme02 = createTheme(apiClient, "Themesc01B", "Theme for sc01-B");
            //NOTIF TOPIC
            final NotificationTopic notTopic01 = createNotificationTopic(apiClient, "TopicSC01A", "This is topic A", null);
            final NotificationTopic notTopic02 = createNotificationTopic(apiClient, "TopicSC01B", "This is topic B", null);
            //NOTIF TOPIC CONF
            createNotificationTopicConfig(
                    apiClient,
                    softCompSC01A.getGuid(),
                    notTopic01.getId(),
                    channel01.getSuppChannel(),
                    lang01.getSuppLang(),
                    true,
                    true
            );
            createNotificationTopicConfig(
                    apiClient,
                    softCompSC01A.getGuid(),
                    notTopic01.getId(),
                    channel01.getSuppChannel(),
                    lang02.getSuppLang(),
                    true,
                    false
            );
            //USER NOTIF PROFILE
            final UserNotificationProfile
                    profile01 =
                    createUserProfile(apiClient, softCompSC01A.getGuid(), lang01.getSuppLang(), "test-01@example.be", "sourceUserStore");
            final UserNotificationProfile
                    profile02 =
                    createUserProfile(apiClient, softCompSC01A.getGuid(), lang02.getSuppLang(), "test-02@example.be", "sourceUserStore");

            //USER CONTACT DETAILS
            final UserContactDetail profile01Contact = createUserContactDetail(apiClient, profile01, channel01.getSuppChannel(), "0123456789");
            final UserContactDetail
                    profile02Contact =
                    createUserContactDetail(apiClient, profile02, channel02.getSuppChannel(), "test-02@example.be");

            //NOTIF TOPIC PREF
            final NotificationTopicPreference
                    userPreference01 =
                    createUserPreference(apiClient, notTopic01.getId(), profile01, channel01.getSuppChannel());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private NotificationTopicPreference createUserPreference(
            final ApiClient apiClient, final String topicId, final UserNotificationProfile profile, final String channel) throws ApiException {
        _LOG.log(Level.INFO, "->create UserPreference:");
        NotificationTopicPreferenceApi confApi = new NotificationTopicPreferenceApi(apiClient);
        NotificationTopicPreference conf = new NotificationTopicPreference();
        conf.setUserId(profile.getUserId());
        conf.setSourceId(profile.getSourceUserStore());
        conf.setSoftwareComponentId(profile.getSoftwareComponentId());
        conf.setNotificationTopicId(topicId);
        conf.setPrefChannel(channel);

        List<NotificationTopicPreference> res = new LinkedList<NotificationTopicPreference>();
        try {
            String
                    query =
                    "{\"where\":{\"userId\":\"" + profile.getUserId() + "\",\"softwareComponentId\":\"" + profile.getSoftwareComponentId()
                    + "\",\"sourceId\":\"" + profile.getSourceUserStore() + "\",\"notificationTopicId\":\"" + topicId + "\",\"prefChannel\":\""
                    + channel + "\"}}";
            res = confApi.notificationTopicPreferenceFind(query);
        } catch (ApiException ignored) {}
        if (res.size() == 0) {
            NotificationTopicPreference resConfig = confApi.notificationTopicPreferenceCreate(conf);
            _LOG.log(Level.INFO, gson.toJson(resConfig));
            return resConfig;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(res));
            //return gson.fromJson(res,NotificationTopic.class);
            return null;
        }
    }

    private UserContactDetail createUserContactDetail(
            final ApiClient apiClient, final UserNotificationProfile profile, final String channel, final String detail) throws ApiException {
        _LOG.log(Level.INFO, "->create UserContactDetail:");
        UserContactDetailApi confApi = new UserContactDetailApi(apiClient);
        UserContactDetail conf = new UserContactDetail();
        conf.setUserId(profile.getUserId());
        conf.setSourceId(profile.getSourceUserStore());
        conf.setSoftwareComponentId(profile.getSoftwareComponentId());
        conf.setCommunicationChannel(channel);
        conf.setChannelDetail(detail);

        List<UserContactDetail> res = new LinkedList<UserContactDetail>();
        try {
            String
                    query =
                    "{\"where\":{\"userId\":\"" + profile.getUserId() + "\",\"softwareComponentId\":\"" + profile.getSoftwareComponentId()
                    + "\",\"sourceId\":\"" + profile.getSourceUserStore() + "\",\"communicationChannel\":\"" + channel + "\",\"channelDetail\":\""
                    + detail + "\"}}";
            res = confApi.userContactDetailFind(query);
        } catch (ApiException ignored) {}
        if (res.size() == 0) {
            UserContactDetail resConfig = confApi.userContactDetailCreate(conf);
            _LOG.log(Level.INFO, gson.toJson(resConfig));
            return resConfig;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(res));
            //return gson.fromJson(res,NotificationTopic.class);
            return null;
        }
    }

    private UserNotificationProfile createUserProfile(
            final ApiClient apiClient, final String softCompId, final String suppLang, final String userId, final String sourceUserStore)
            throws ApiException {
        _LOG.log(Level.INFO, "->create UserProfile:");
        UserNotificationProfileApi confApi = new UserNotificationProfileApi(apiClient);
        UserNotificationProfile conf = new UserNotificationProfile();
        conf.setUserId(userId);
        conf.setNotifLang(suppLang);
        conf.setSoftwareComponentId(softCompId);
        conf.setSourceUserStore(sourceUserStore);

        List<UserNotificationProfile> res = new LinkedList<UserNotificationProfile>();
        try {
            String
                    query =
                    "{\"where\":{\"userId\":\"" + userId + "\",\"sourceUserStore\":\"" + sourceUserStore
                    + "\",\"softwareComponentId\":\"" + softCompId + "\"}}";
            res = confApi.userNotificationProfileFind(query);
        } catch (ApiException ignored) {}
        if (res.size() == 0) {
            UserNotificationProfile resConfig = confApi.userNotificationProfileCreate(conf);
            _LOG.log(Level.INFO, gson.toJson(resConfig));
            return resConfig;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(res));
            return res.get(0);
        }
    }

    private NotificationTopicConfig createNotificationTopicConfig(
            ApiClient apiClient, String softCompId, String notTopicId, String suppChannelId, String suppLangId, Boolean isDefaultChannel,
            Boolean isDefaultLang) throws ApiException {
        _LOG.log(Level.INFO, "->create NotifTopicConfig:");
        NotificationTopicConfigApi confApi = new NotificationTopicConfigApi(apiClient);
        NotificationTopicConfig conf = new NotificationTopicConfig();
        conf.setIsDefaultChannel(isDefaultChannel);
        conf.setIsDefaultLang(isDefaultLang);
        conf.setNotificationTopicId(notTopicId);
        conf.setSoftwareComponentId(softCompId);
        conf.setSupportedCommChannelId(suppChannelId);
        conf.setSupportedLanguageId(suppLangId);

        List<NotificationTopicConfig> res = new LinkedList<NotificationTopicConfig>();
        try {
            String query =
                    "{\"where\":{\"notificationTopicId\":\"" + notTopicId + "\",\"softwareComponentId\":\"" + softCompId
                    + "\",\"supportedLanguageId\":\"" + suppLangId + "\",\"supportedCommChannelId\":\"" + suppChannelId + "\"}}";
            res = confApi.notificationTopicConfigFind(query);
        } catch (ApiException ignored) {}
        if (res.size() == 0) {
            NotificationTopicConfig resConfig = confApi.notificationTopicConfigCreate(conf);
            _LOG.log(Level.INFO, gson.toJson(resConfig));
            return resConfig;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(res));
            //return gson.fromJson(res,NotificationTopic.class);
            return null;
        }
    }

    /**
     * Create Theme
     *
     * @param apiClient
     */
    private Theme createTheme(ApiClient apiClient, String title, String description) throws ApiException {
        _LOG.log(Level.INFO, "->create Theme:");
        ThemeApi themeApi = new ThemeApi(apiClient);
        Theme theme = new Theme();
        theme.setTitle(title);
        theme.setDescription(description);

        List<Theme> themes = new LinkedList<Theme>();
        try {
            String query = "{\"where\":{\"title\":\"" + title + "\"}}";
            themes = themeApi.themeFind(query);
        } catch (ApiException ignored) {}
        if (themes == null || themes.size() == 0) {
            final Theme resTheme = themeApi.themeCreate(theme);
            _LOG.log(Level.INFO, gson.toJson(resTheme));
            return resTheme;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(theme));
            return (themes.size() > 0) ? themes.get(0) : null;
        }
    }

    private NotificationTopic createNotificationTopic(ApiClient apiClient, String id, String desc, String themeid) throws ApiException {
        _LOG.log(Level.INFO, "->create Notification Topic:");
        NotificationTopicApi notApi = new NotificationTopicApi(apiClient);
        NotificationTopic nTopic = new NotificationTopic();
        nTopic.setDescription(desc);
        nTopic.setThemeId(themeid);
        nTopic.setTitle(id);

        String res = null;
        try {
            res = notApi.notificationTopicGetTopicByTitle(nTopic.getTitle());
        } catch (ApiException ignored) {}
        if (res == null) {
            final NotificationTopic resNottop = notApi.notificationTopicCreate(nTopic);
            _LOG.log(Level.INFO, gson.toJson(resNottop));
            return resNottop;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(res));
            return gson.fromJson(res, NotificationTopic.class);
        }
    }

    private SupportedCommChannel createChannel(ApiClient apiClient, String s) throws ApiException {
        _LOG.log(Level.INFO, "->create Supported Channel:");
        SupportedCommChannelApi capi = new SupportedCommChannelApi(apiClient);
        SupportedCommChannel supportedCommChannel = null;

        try {
            supportedCommChannel = capi.supportedCommChannelFindById(s, null);
        } catch (ApiException ignored) {}
        if (supportedCommChannel == null) {
            SupportedCommChannel supc = new SupportedCommChannel();
            supc.setSuppChannel(s);
            final SupportedCommChannel resChannel = capi.supportedCommChannelCreate(supc);
            _LOG.log(Level.INFO, gson.toJson(resChannel));
            return resChannel;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(supportedCommChannel));
            return supportedCommChannel;
        }
    }

    private SupportedLanguage createLanguage(ApiClient apiClient, String s) throws ApiException {
        _LOG.log(Level.INFO, "->create Supported Language:");
        SupportedLanguageApi supApi = new SupportedLanguageApi(apiClient);
        SupportedLanguage supportedLanguage = null;

        try {
            supportedLanguage = supApi.supportedLanguageFindById(s, null);
        } catch (ApiException ignored) {}
        if (supportedLanguage == null) {
            SupportedLanguage suplang = new SupportedLanguage();
            suplang.setSuppLang(s);
            final SupportedLanguage resLang = supApi.supportedLanguageCreate(suplang);
            _LOG.log(Level.INFO, gson.toJson(resLang));
            return resLang;
        } else {
            _LOG.log(Level.INFO, "exists:" + gson.toJson(supportedLanguage));
            return supportedLanguage;
        }
    }

    private SoftwareComponent createSoftwareComponent(ApiClient apiClient, String type, String name, String parentId, String version)
            throws ApiException {
        _LOG.log(Level.INFO, "->create Software Component:");
        SoftwareComponentApi softwareComponentApi = new SoftwareComponentApi(apiClient);

        String s = null;
        try {
            s = softwareComponentApi.softwareComponentGetComponentByName(name);
        } catch (ApiException ignored) {}
        if (s == null) {
            SoftwareComponent sc = new SoftwareComponent();
            sc.name(name);
            sc.setCompType(type);
            sc.setParentId(parentId);
            sc.setVersion(version);
            final SoftwareComponent resSc = softwareComponentApi.softwareComponentCreate(sc);
            _LOG.log(Level.INFO, gson.toJson(resSc));
            return resSc;
        } else {
            //final SoftwareComponent resSc = softwareComponentApi.softwareComponentFindById(s,null);
            _LOG.log(Level.INFO, "exists:" + gson.toJson(s));
            return gson.fromJson(s, SoftwareComponent.class);//resSc;
        }
    }

    private ApiClient createApiClient(String apikey, String uri) {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(apikey);
        apiClient.setBasePath(uri);
        return apiClient;
    }
}
