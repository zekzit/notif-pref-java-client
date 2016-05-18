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
import io.swagger.client.model.NotificationTopic;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class NotificationTopicApi {
  private ApiClient apiClient;

  public NotificationTopicApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificationTopicApi(ApiClient apiClient) {
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
  public Object notificationTopicCount(String where) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/count".replaceAll("\\{format\\}","json");

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
   * @return NotificationTopic
   * @throws ApiException if fails to make API call
   */
  public NotificationTopic notificationTopicCreate(NotificationTopic data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/NotificationTopics".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificationTopic> localVarReturnType = new GenericType<NotificationTopic>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicDeleteById(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicDeleteById");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
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
  public Object notificationTopicExistsGetNotificationTopicsidExists(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicExistsGetNotificationTopicsidExists");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/{id}/exists".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
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
  public Object notificationTopicExistsHeadNotificationTopicsid(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicExistsHeadNotificationTopicsid");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find all instances of the model matched by filter from the data source.
   * 
   * @param filter Filter defining fields, where, include, order, offset, and limit (optional)
   * @return List<NotificationTopic>
   * @throws ApiException if fails to make API call
   */
  public List<NotificationTopic> notificationTopicFind(String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/NotificationTopics".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<NotificationTopic>> localVarReturnType = new GenericType<List<NotificationTopic>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include (optional)
   * @return NotificationTopic
   * @throws ApiException if fails to make API call
   */
  public NotificationTopic notificationTopicFindById(String id, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicFindById");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<NotificationTopic> localVarReturnType = new GenericType<NotificationTopic>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * get config of topics by softwarecomp id
   * 
   * @param swId software component id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String notificationTopicGetAllTopicConfigBySoftwareComp(String swId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'swId' is set
    if (swId == null) {
      throw new ApiException(400, "Missing the required parameter 'swId' when calling notificationTopicGetAllTopicConfigBySoftwareComp");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/TopicConfigBySoftwareComp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sw_id", swId));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get the details of a topic by preference ID
   * 
   * @param ntId notification topic ID (required)
   * @param userId profile user_id ID (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicGetDetailsByUserId(String ntId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ntId' is set
    if (ntId == null) {
      throw new ApiException(400, "Missing the required parameter 'ntId' when calling notificationTopicGetDetailsByUserId");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling notificationTopicGetDetailsByUserId");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/getDetailsByUserId".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nt_id", ntId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    

    

    

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
   * Get the preferences of a notifcation topic
   * 
   * @param ntId notification topic ID (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicGetPreferences(String ntId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ntId' is set
    if (ntId == null) {
      throw new ApiException(400, "Missing the required parameter 'ntId' when calling notificationTopicGetPreferences");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/getPreferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nt_id", ntId));
    

    

    

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
   * Get the theme of a notification topic
   * 
   * @param ntId notification topic ID (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object notificationTopicGetTheme(String ntId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ntId' is set
    if (ntId == null) {
      throw new ApiException(400, "Missing the required parameter 'ntId' when calling notificationTopicGetTheme");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/getTheme".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nt_id", ntId));
    

    

    

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
   * get topic by title
   * 
   * @param topicTitle Notification Topic title (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String notificationTopicGetTopicByTitle(String topicTitle) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topicTitle' is set
    if (topicTitle == null) {
      throw new ApiException(400, "Missing the required parameter 'topicTitle' when calling notificationTopicGetTopicByTitle");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/getTopicByTitle".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic_title", topicTitle));
    

    

    

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded", "application/xml", "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update attributes for a model instance and persist it into the data source.
   * 
   * @param id PersistedModel id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return NotificationTopic
   * @throws ApiException if fails to make API call
   */
  public NotificationTopic notificationTopicPrototypeUpdateAttributes(String id, NotificationTopic data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling notificationTopicPrototypeUpdateAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/NotificationTopics/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<NotificationTopic> localVarReturnType = new GenericType<NotificationTopic>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return NotificationTopic
   * @throws ApiException if fails to make API call
   */
  public NotificationTopic notificationTopicUpsert(NotificationTopic data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/NotificationTopics".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificationTopic> localVarReturnType = new GenericType<NotificationTopic>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
