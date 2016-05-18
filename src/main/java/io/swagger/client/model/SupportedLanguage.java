package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class SupportedLanguage   {
  
  private String suppLang = null;

  
  /**
   **/
  public SupportedLanguage suppLang(String suppLang) {
    this.suppLang = suppLang;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("suppLang")
  public String getSuppLang() {
    return suppLang;
  }
  public void setSuppLang(String suppLang) {
    this.suppLang = suppLang;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedLanguage supportedLanguage = (SupportedLanguage) o;
    return Objects.equals(this.suppLang, supportedLanguage.suppLang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppLang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguage {\n");
    
    sb.append("    suppLang: ").append(toIndentedString(suppLang)).append("\n");
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

