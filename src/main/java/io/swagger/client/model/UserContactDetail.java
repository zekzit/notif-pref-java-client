package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class UserContactDetail   {
  
  private String communicationChannel = null;
  private String channelDetail = null;
  private String id = null;
  private String sourceUserStore = null;
  private String userId = null;
  private String softwareComponentId = null;

  
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
  public UserContactDetail sourceUserStore(String sourceId) {
    this.sourceUserStore = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sourceUserStore")
  public String getSourceUserStore() {
    return sourceUserStore;
  }
  public void setSourceUserStore(String sourceUserStore) {
    this.sourceUserStore = sourceUserStore;
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

  /**
   **/
  public UserContactDetail softwareComponentId(String softwareComponentId) {
    this.softwareComponentId = softwareComponentId;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareComponentId")
  public String getSoftwareComponentId() {
    return softwareComponentId;
  }
  public void setSoftwareComponentId(final String softwareComponentId) {
    this.softwareComponentId = softwareComponentId;
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
           Objects.equals(this.sourceUserStore, userContactDetail.sourceUserStore) &&
           Objects.equals(this.softwareComponentId, userContactDetail.softwareComponentId) &&
           Objects.equals(this.userId, userContactDetail.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationChannel, channelDetail, id, sourceUserStore, userId, softwareComponentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserContactDetail {\n");
    
    sb.append("    communicationChannel: ").append(toIndentedString(communicationChannel)).append("\n");
    sb.append("    channelDetail: ").append(toIndentedString(channelDetail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceUserStore: ").append(toIndentedString(sourceUserStore)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    softwareComponentId: ").append(toIndentedString(softwareComponentId)).append("\n");
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

