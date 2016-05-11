import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.SoftwareComponentApi;
import io.swagger.client.model.SoftwareComponent;

/**
 * Created by michallispashidis on 11/05/16.
 */
public class TestClient {
    public TestClient(){}
    public static void main(String []args){
        TestClient tc = new TestClient();
        ApiClient apiClient = tc.createApiClient("9ef64835-7d68-4ae8-b6ec-5df25aec186f","https://api-gw-o.antwerpen.be/acpaas/userprefs/v1");
        tc.createSoftwareComponent(apiClient);
    }

    private ApiClient createApiClient(String apikey, String uri) {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(apikey);
        apiClient.setBasePath(uri);
        return apiClient;
    }

    private void createSoftwareComponent(ApiClient apiClient) {
        SoftwareComponentApi softwareComponentApi = new SoftwareComponentApi(apiClient);
        SoftwareComponent sc = new SoftwareComponent();
        sc.setCompType("Application");
        sc.setName("t1t-dummy-sc");
        sc.setParentId("");
        sc.setVersion("v1");
        try {
            softwareComponentApi.softwareComponentCreate(sc);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
