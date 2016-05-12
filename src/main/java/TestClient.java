import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.*;
import io.swagger.client.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michallispashidis on 11/05/16.
 */
public class TestClient {
    public TestClient(){}
    public static void main(String []args){
        TestClient tc = new TestClient();
        //ApiClient apiClient = tc.createApiClient("9ef64835-7d68-4ae8-b6ec-5df25aec186f","https://api-gw-o.antwerpen.be/acpaas/userprefs/v1");
        //ApiClient apiClient = tc.createApiClient("5c044f41-3836-4a28-9809-823ce04481ca","https://devprefapi.t1t.be/api/v1");//http://localhost:3001/api/v1
        ApiClient apiClient = tc.createApiClient("5c044f41-3836-4a28-9809-823ce04481ca","http://localhost:3001/api/v1/");
        tc.execUC1(apiClient);
    }

    /**
     * CheckMK use case
     * @param apiClient
     */
    private void execUC1(ApiClient apiClient) {
        try {
            //SOFT COMP
            createSoftwareComponent(apiClient,"Application","t1t-dummy-sc01","","v1");
            //LANG
            createLanguage(apiClient,"nl-BE");
            createLanguage(apiClient,"fr-BE");
            createLanguage(apiClient,"en-EN");
            //CHANNELS
            createChannel(apiClient,"SMS");
            createChannel(apiClient,"EMAIL");
            createChannel(apiClient,"SOCKET");
            //THEMA
            createTheme(apiClient,"Themesc01A","Theme for sc01-A");
            createTheme(apiClient,"Themesc01B","Theme for sc01-B");
            //NOTIF TOPIC
            createNotificationTopic(apiClient,"TopicSC01A","This is topic A",null);
            createNotificationTopic(apiClient,"TopicSC01B","This is topic B",null);
            //NOTIF TOPIC CONF
            
            //NOTIF TOPIC PREF

            //USER NOTIF PROFILE

            //USER CONTACT DETAILS
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create Theme
     * @param apiClient
     */
    private void createTheme(ApiClient apiClient, String title, String description) throws ApiException {
        ThemeApi themeApi = new ThemeApi(apiClient);
        Theme theme = new Theme();
        theme.setTitle(title);
        theme.setDescription(description);
        List<Theme> themes = new ArrayList<Theme>();
        try{
            String query = "{\"where\":{\"title\":\""+title+"\"}}";
            themes = themeApi.themeFind(query);
        }catch (ApiException e) {
            ;//ignore
        }
        if(themes==null ||themes.size()==0){
            themeApi.themeCreate(theme);
        }
    }

    private void createNotificationTopic(ApiClient apiClient, String id, String desc, String themeid) throws ApiException {
        NotificationTopicApi notApi = new NotificationTopicApi(apiClient);
        NotificationTopic nTopic = new NotificationTopic();
        nTopic.setDescription(desc);
        nTopic.setThemeId(themeid);
        nTopic.setTitle(id);
        String res = null;
        try {
            res = notApi.notificationTopicGetTopicByTitle(nTopic.getTitle());
        } catch (ApiException e) {
            ;//ignore
        }
        if(res==null){
            notApi.notificationTopicCreate(nTopic);
        }
    }

    private void createChannel(ApiClient apiClient, String s) throws ApiException {
        SupportedCommChannelApi capi = new SupportedCommChannelApi(apiClient);
        SupportedCommChannel supportedCommChannel=null;
        try {
            supportedCommChannel = capi.supportedCommChannelFindById(s, null);
        } catch (ApiException e) {
            ;//continue
        }
        if(supportedCommChannel==null){
            SupportedCommChannel supc = new SupportedCommChannel();
            supc.setSuppChannel(s);
            capi.supportedCommChannelCreate(supc);
        }
    }

    private void createLanguage(ApiClient apiClient, String s) throws ApiException {
        SupportedLanguageApi supApi = new SupportedLanguageApi(apiClient);
        SupportedLanguage supportedLanguage = null;
        try {
            supportedLanguage = supApi.supportedLanguageFindById(s, null);
        } catch (ApiException e) {
            ;//continue
        }
        if(supportedLanguage==null){
            SupportedLanguage suplang = new SupportedLanguage();
            suplang.setSuppLang(s);
            supApi.supportedLanguageCreate(suplang);
        }
    }

    private ApiClient createApiClient(String apikey, String uri) {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(apikey);
        apiClient.setBasePath(uri);
        return apiClient;
    }

    private void createSoftwareComponent(ApiClient apiClient, String type, String name, String parentId, String version) throws ApiException {
        SoftwareComponentApi softwareComponentApi = new SoftwareComponentApi(apiClient);
        String s = null;
        try {
            s = softwareComponentApi.softwareComponentGetComponentByName(name);
        } catch (ApiException e) {
            ;//ignore and continue, object does not exists
        }
        if(s==null){
            SoftwareComponent sc = new SoftwareComponent();
            sc.setCompType(type);
            sc.setName(name);
            sc.setParentId(parentId);
            sc.setVersion(version);
            softwareComponentApi.softwareComponentCreate(sc);
        }
    }
}
