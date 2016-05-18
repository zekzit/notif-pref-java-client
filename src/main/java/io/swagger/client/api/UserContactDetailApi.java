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
import io.swagger.client.model.UserContactDetail;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class UserContactDetailApi {
  private ApiClient apiClient;

  public UserContactDetailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserContactDetailApi(ApiClient apiClient) {
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
  public Object userContactDetailCount(String where) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/count".replaceAll("\\{format\\}","json");

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
   * @return UserContactDetail
   * @throws ApiException if fails to make API call
   */
  public UserContactDetail userContactDetailCreate(UserContactDetail data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/UserContactDetails".replaceAll("\\{format\\}","json");

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

    
    GenericType<UserContactDetail> localVarReturnType = new GenericType<UserContactDetail>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object userContactDetailDeleteById(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userContactDetailDeleteById");
    }
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/{id}".replaceAll("\\{format\\}","json")
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
  public Object userContactDetailExistsGetUserContactDetailsidExists(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userContactDetailExistsGetUserContactDetailsidExists");
    }
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/{id}/exists".replaceAll("\\{format\\}","json")
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
  public Object userContactDetailExistsHeadUserContactDetailsid(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userContactDetailExistsHeadUserContactDetailsid");
    }
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/{id}".replaceAll("\\{format\\}","json")
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
   * @return List<UserContactDetail>
   * @throws ApiException if fails to make API call
   */
  public List<UserContactDetail> userContactDetailFind(String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/UserContactDetails".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<UserContactDetail>> localVarReturnType = new GenericType<List<UserContactDetail>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Find a model instance by id from the data source.
   * 
   * @param id Model id (required)
   * @param filter Filter defining fields and include (optional)
   * @return UserContactDetail
   * @throws ApiException if fails to make API call
   */
  public UserContactDetail userContactDetailFindById(String id, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userContactDetailFindById");
    }
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<UserContactDetail> localVarReturnType = new GenericType<UserContactDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update attributes for a model instance and persist it into the data source.
   * 
   * @param id PersistedModel id (required)
   * @param data An object of model property name/value pairs (optional)
   * @return UserContactDetail
   * @throws ApiException if fails to make API call
   */
  public UserContactDetail userContactDetailPrototypeUpdateAttributes(String id, UserContactDetail data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userContactDetailPrototypeUpdateAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/UserContactDetails/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<UserContactDetail> localVarReturnType = new GenericType<UserContactDetail>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update an existing model instance or insert a new one into the data source.
   * 
   * @param data Model instance data (optional)
   * @return UserContactDetail
   * @throws ApiException if fails to make API call
   */
  public UserContactDetail userContactDetailUpsert(UserContactDetail data) throws ApiException {
    Object localVarPostBody = data;
    
    // create path and map variables
    String localVarPath = "/UserContactDetails".replaceAll("\\{format\\}","json");

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

    
    GenericType<UserContactDetail> localVarReturnType = new GenericType<UserContactDetail>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
