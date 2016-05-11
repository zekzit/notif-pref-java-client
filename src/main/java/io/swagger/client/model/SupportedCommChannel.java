package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class SupportedCommChannel   {
  
  private String suppChannel = null;

  
  /**
   **/
  public SupportedCommChannel suppChannel(String suppChannel) {
    this.suppChannel = suppChannel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("suppChannel")
  public String getSuppChannel() {
    return suppChannel;
  }
  public void setSuppChannel(String suppChannel) {
    this.suppChannel = suppChannel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedCommChannel supportedCommChannel = (SupportedCommChannel) o;
    return Objects.equals(this.suppChannel, supportedCommChannel.suppChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedCommChannel {\n");
    
    sb.append("    suppChannel: ").append(toIndentedString(suppChannel)).append("\n");
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

