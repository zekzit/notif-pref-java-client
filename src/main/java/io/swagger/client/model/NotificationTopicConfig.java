package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class NotificationTopicConfig   {
  
  private String id = null;
  private Boolean isDefaultLang = false;
  private Boolean isDefaultChannel = false;
  private String notificationTopicId = null;
  private String softwareComponentId = null;
  private String supportedLanguageId = null;
  private String supportedCommChannelId = null;

  
  /**
   **/
  public NotificationTopicConfig id(String id) {
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
  public NotificationTopicConfig isDefaultLang(Boolean isDefaultLang) {
    this.isDefaultLang = isDefaultLang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isDefaultLang")
  public Boolean getIsDefaultLang() {
    return isDefaultLang;
  }
  public void setIsDefaultLang(Boolean isDefaultLang) {
    this.isDefaultLang = isDefaultLang;
  }

  
  /**
   **/
  public NotificationTopicConfig isDefaultChannel(Boolean isDefaultChannel) {
    this.isDefaultChannel = isDefaultChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isDefaultChannel")
  public Boolean getIsDefaultChannel() {
    return isDefaultChannel;
  }
  public void setIsDefaultChannel(Boolean isDefaultChannel) {
    this.isDefaultChannel = isDefaultChannel;
  }

  
  /**
   **/
  public NotificationTopicConfig notificationTopicId(String notificationTopicId) {
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
  public NotificationTopicConfig softwareComponentId(String softwareComponentId) {
    this.softwareComponentId = softwareComponentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareComponentId")
  public String getSoftwareComponentId() {
    return softwareComponentId;
  }
  public void setSoftwareComponentId(String softwareComponentId) {
    this.softwareComponentId = softwareComponentId;
  }

  
  /**
   **/
  public NotificationTopicConfig supportedLanguageId(String supportedLanguageId) {
    this.supportedLanguageId = supportedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("supportedLanguageId")
  public String getSupportedLanguageId() {
    return supportedLanguageId;
  }
  public void setSupportedLanguageId(String supportedLanguageId) {
    this.supportedLanguageId = supportedLanguageId;
  }

  
  /**
   **/
  public NotificationTopicConfig supportedCommChannelId(String supportedCommChannelId) {
    this.supportedCommChannelId = supportedCommChannelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("supportedCommChannelId")
  public String getSupportedCommChannelId() {
    return supportedCommChannelId;
  }
  public void setSupportedCommChannelId(String supportedCommChannelId) {
    this.supportedCommChannelId = supportedCommChannelId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTopicConfig notificationTopicConfig = (NotificationTopicConfig) o;
    return Objects.equals(this.id, notificationTopicConfig.id) &&
        Objects.equals(this.isDefaultLang, notificationTopicConfig.isDefaultLang) &&
        Objects.equals(this.isDefaultChannel, notificationTopicConfig.isDefaultChannel) &&
        Objects.equals(this.notificationTopicId, notificationTopicConfig.notificationTopicId) &&
        Objects.equals(this.softwareComponentId, notificationTopicConfig.softwareComponentId) &&
        Objects.equals(this.supportedLanguageId, notificationTopicConfig.supportedLanguageId) &&
        Objects.equals(this.supportedCommChannelId, notificationTopicConfig.supportedCommChannelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isDefaultLang, isDefaultChannel, notificationTopicId, softwareComponentId, supportedLanguageId, supportedCommChannelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTopicConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefaultLang: ").append(toIndentedString(isDefaultLang)).append("\n");
    sb.append("    isDefaultChannel: ").append(toIndentedString(isDefaultChannel)).append("\n");
    sb.append("    notificationTopicId: ").append(toIndentedString(notificationTopicId)).append("\n");
    sb.append("    softwareComponentId: ").append(toIndentedString(softwareComponentId)).append("\n");
    sb.append("    supportedLanguageId: ").append(toIndentedString(supportedLanguageId)).append("\n");
    sb.append("    supportedCommChannelId: ").append(toIndentedString(supportedCommChannelId)).append("\n");
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

