package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class NotificationTopicPreference   {
  
  private String prefChannel = null;
  private String id = null;
  private String sourceUserStore = null;
  private String notificationTopicId = null;
  private String userId = null;
  private String softwareComponentId = null;

  
  /**
   **/
  public NotificationTopicPreference prefChannel(String prefChannel) {
    this.prefChannel = prefChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prefChannel")
  public String getPrefChannel() {
    return prefChannel;
  }
  public void setPrefChannel(String prefChannel) {
    this.prefChannel = prefChannel;
  }

  
  /**
   **/
  public NotificationTopicPreference id(String id) {
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
  public NotificationTopicPreference sourceUserStore(String sourceId) {
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
  public NotificationTopicPreference notificationTopicId(String notificationTopicId) {
    this.notificationTopicId = notificationTopicId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationTopicId")
  public String getNotificationTopicId() {
    return notificationTopicId;
  }
  public void setNotificationTopicId(String notificationTopicId) {
    this.notificationTopicId = notificationTopicId;
  }

  
  /**
   **/
  public NotificationTopicPreference userId(String userId) {
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
  public NotificationTopicPreference softwareComponentId(String softwareComponentId) {
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
    NotificationTopicPreference notificationTopicPreference = (NotificationTopicPreference) o;
    return Objects.equals(this.prefChannel, notificationTopicPreference.prefChannel) &&
           Objects.equals(this.id, notificationTopicPreference.id) &&
           Objects.equals(this.sourceUserStore, notificationTopicPreference.sourceUserStore) &&
           Objects.equals(this.notificationTopicId, notificationTopicPreference.notificationTopicId) &&
           Objects.equals(this.softwareComponentId, notificationTopicPreference.softwareComponentId) &&
           Objects.equals(this.userId, notificationTopicPreference.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefChannel, id, sourceUserStore, notificationTopicId, userId, softwareComponentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTopicPreference {\n");
    
    sb.append("    prefChannel: ").append(toIndentedString(prefChannel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceUserStore: ").append(toIndentedString(sourceUserStore)).append("\n");
    sb.append("    notificationTopicId: ").append(toIndentedString(notificationTopicId)).append("\n");
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

