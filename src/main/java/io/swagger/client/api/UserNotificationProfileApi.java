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
import io.swagger.client.model.UserNotificationProfile;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class UserNotificationProfileApi {
  private ApiClient apiClient;

  public UserNotificationProfileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserNotificationProfileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get the contact details of an user profile based on the user and source IDs
   * 
   * @param userid user ID (required)
   * @param sourceid source user store (required)
   * @return UserNotificationProfile
   * @throws ApiException if fails to make API call
   */
  public UserNotificationProfile userNotificationProfileContactDetails(String userid, String sourceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling userNotificationProfileContactDetails");
    }
    
    // verify the required parameter 'sourceid' is set
    if (sourceid == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceid' when calling userNotificationProfileContactDetails");
    }
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles/getContactDetails".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userid", userid));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceid", sourceid));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"kongApiKey"};

    
    GenericType<UserNotificationProfile> localVarReturnType = new GenericType<UserNotificationProfile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Count instances of the model matched by where from the data source.
   * 
   * @param where Criteria to match model instances (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object userNotificationProfileCount(String where) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles/count".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data (optional)
   * @return UserNotificationProfile
   * @throws ApiException if fails to make API call
   */
  public UserNotificationProfile userNotificationProfileCreate(UserNotificationProfile data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserNotificationProfile> localVarReturnType = new GenericType<UserNotificationProfile>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * deletes an user profile based on the user and source IDs
   * 
   * @param userid user ID (required)
   * @param sourceid source user store (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object userNotificationProfileDelProfile(String userid, String sourceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling userNotificationProfileDelProfile");
    }
    
    // verify the required parameter 'sourceid' is set
    if (sourceid == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceid' when calling userNotificationProfileDelProfile");
    }
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles/deleteUserProfile/{userid}/{sourceid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userid" + "\\}", apiClient.escapeString(userid.toString()))
      .replaceAll("\\{" + "sourceid" + "\\}", apiClient.escapeString(sourceid.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit (optional)
   * @return List<UserNotificationProfile>
   * @throws ApiException if fails to make API call
   */
  public List<UserNotificationProfile> userNotificationProfileFind(String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<UserNotificationProfile>> localVarReturnType = new GenericType<List<UserNotificationProfile>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * get a profile based on the user and source IDs
   * 
   * @param userid user ID (required)
   * @param sourceid source user store (required)
   * @return UserNotificationProfile
   * @throws ApiException if fails to make API call
   */
  public UserNotificationProfile userNotificationProfileGetByIDs(String userid, String sourceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling userNotificationProfileGetByIDs");
    }
    
    // verify the required parameter 'sourceid' is set
    if (sourceid == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceid' when calling userNotificationProfileGetByIDs");
    }
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles/getProfile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userid", userid));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceid", sourceid));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserNotificationProfile> localVarReturnType = new GenericType<UserNotificationProfile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * get the preferences of a profile based on the user and source IDs
   * 
   * @param userid user ID (required)
   * @param sourceid source user store (required)
   * @return UserNotificationProfile
   * @throws ApiException if fails to make API call
   */
  public UserNotificationProfile userNotificationProfileGetPreferences(String userid, String sourceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userid' is set
    if (userid == null) {
      throw new ApiException(400, "Missing the required parameter 'userid' when calling userNotificationProfileGetPreferences");
    }
    
    // verify the required parameter 'sourceid' is set
    if (sourceid == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceid' when calling userNotificationProfileGetPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles/getPreferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userid", userid));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceid", sourceid));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserNotificationProfile> localVarReturnType = new GenericType<UserNotificationProfile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return UserNotificationProfile
   * @throws ApiException if fails to make API call
   */
  public UserNotificationProfile userNotificationProfileUpsert(UserNotificationProfile data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/UserNotificationProfiles".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserNotificationProfile> localVarReturnType = new GenericType<UserNotificationProfile>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
