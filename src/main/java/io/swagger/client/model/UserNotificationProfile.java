package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class UserNotificationProfile   {
  
  private String userId = null;
  private String notifLang = null;
  private String sourceUserStore = null;

  
  /**
   **/
  public UserNotificationProfile userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public UserNotificationProfile notifLang(String notifLang) {
    this.notifLang = notifLang;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("notifLang")
  public String getNotifLang() {
    return notifLang;
  }
  public void setNotifLang(String notifLang) {
    this.notifLang = notifLang;
  }

  
  /**
   **/
  public UserNotificationProfile sourceUserStore(String sourceUserStore) {
    this.sourceUserStore = sourceUserStore;
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationProfile userNotificationProfile = (UserNotificationProfile) o;
    return Objects.equals(this.userId, userNotificationProfile.userId) &&
        Objects.equals(this.notifLang, userNotificationProfile.notifLang) &&
        Objects.equals(this.sourceUserStore, userNotificationProfile.sourceUserStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, notifLang, sourceUserStore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationProfile {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    notifLang: ").append(toIndentedString(notifLang)).append("\n");
    sb.append("    sourceUserStore: ").append(toIndentedString(sourceUserStore)).append("\n");
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

