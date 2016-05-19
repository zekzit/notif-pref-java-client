package io.swagger.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.jersey.api.client.GenericType;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.model.NotificationTopicPreference;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class NotificationTopicPreferenceApi {
  private ApiClient apiClient;

  public NotificationTopicPreferenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationTopicPreferenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceCount(String where) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "where", where));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"kongApiKey"};

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return NotificationTopicPreference
   * @throws ApiException if fails to make API call
   */
  public NotificationTopicPreference notificationTopicPreferenceCreate(NotificationTopicPreference data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<NotificationTopicPreference> localVarReturnType = new GenericType<NotificationTopicPreference>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceDeleteById(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPreferenceDeleteById");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Check whether a model instance exists in the data source.
   * 
   * @param id Model id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceExistsGetNotificationTopicPreferencesidExists(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPreferenceExistsGetNotificationTopicPreferencesidExists");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/{id}/exists".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Check whether a model instance exists in the data source.
   * 
   * @param id Model id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceExistsHeadNotificationTopicPreferencesid(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPreferenceExistsHeadNotificationTopicPreferencesid");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit (optional)
   * @return List<NotificationTopicPreference>
   * @throws ApiException if fails to make API call
   */
  public List<NotificationTopicPreference> notificationTopicPreferenceFind(String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<List<NotificationTopicPreference>> localVarReturnType = new GenericType<List<NotificationTopicPreference>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include (optional)
   * @return NotificationTopicPreference
   * @throws ApiException if fails to make API call
   */
  public NotificationTopicPreference notificationTopicPreferenceFindById(String id, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPreferenceFindById");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<NotificationTopicPreference> localVarReturnType = new GenericType<NotificationTopicPreference>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * get a profile based on the user ID
   * 
   * @param userid user ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String notificationTopicPreferenceGetProfileByUserID(String userid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling notificationTopicPreferenceGetProfileByUserID");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/getUserProfileByUserId".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userid", userid));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the notification topic of a preference ID
   * 
   * @param ntpId notification topic preference ID (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceGetTopic(String ntpId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ntpId' is set
    if (ntpId == null) {
      throw new ApiException(400, "Missing the required parameter 'ntpId' when calling notificationTopicPreferenceGetTopic");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/getNotificationTopic".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ntp_id", ntpId));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the user profile of a preference ID
   * 
   * @param ntpId notification topic preference ID (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicPreferenceGetUserProfile(String ntpId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ntpId' is set
    if (ntpId == null) {
      throw new ApiException(400, "Missing the required parameter 'ntpId' when calling notificationTopicPreferenceGetUserProfile");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/getUserProfile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ntp_id", ntpId));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update attributes for a model instance and persist it into the data source.
   * 
   * @param id PersistedModel id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return NotificationTopicPreference
   * @throws ApiException if fails to make API call
   */
  public NotificationTopicPreference notificationTopicPreferencePrototypeUpdateAttributes(String id, NotificationTopicPreference data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPreferencePrototypeUpdateAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<NotificationTopicPreference> localVarReturnType = new GenericType<NotificationTopicPreference>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return NotificationTopicPreference
   * @throws ApiException if fails to make API call
   */
  public NotificationTopicPreference notificationTopicPreferenceUpsert(NotificationTopicPreference data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/NotificationTopicPreferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "kongApiKey" };

    
    GenericType<NotificationTopicPreference> localVarReturnType = new GenericType<NotificationTopicPreference>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
