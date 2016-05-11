package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class UserContactDetail   {
  
  private String communicationChannel = null;
  private String channelDetail = null;
  private String id = null;
  private String sourceId = null;
  private String userId = null;

  
  /**
   **/
  public UserContactDetail communicationChannel(String communicationChannel) {
    this.communicationChannel = communicationChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("communicationChannel")
  public String getCommunicationChannel() {
    return communicationChannel;
  }
  public void setCommunicationChannel(String communicationChannel) {
    this.communicationChannel = communicationChannel;
  }

  
  /**
   **/
  public UserContactDetail channelDetail(String channelDetail) {
    this.channelDetail = channelDetail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channelDetail")
  public String getChannelDetail() {
    return channelDetail;
  }
  public void setChannelDetail(String channelDetail) {
    this.channelDetail = channelDetail;
  }

  
  /**
   **/
  public UserContactDetail id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public UserContactDetail sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   **/
  public UserContactDetail userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserContactDetail userContactDetail = (UserContactDetail) o;
    return Objects.equals(this.communicationChannel, userContactDetail.communicationChannel) &&
        Objects.equals(this.channelDetail, userContactDetail.channelDetail) &&
        Objects.equals(this.id, userContactDetail.id) &&
        Objects.equals(this.sourceId, userContactDetail.sourceId) &&
        Objects.equals(this.userId, userContactDetail.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationChannel, channelDetail, id, sourceId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserContactDetail {\n");
    
    sb.append("    communicationChannel: ").append(toIndentedString(communicationChannel)).append("\n");
    sb.append("    channelDetail: ").append(toIndentedString(channelDetail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

