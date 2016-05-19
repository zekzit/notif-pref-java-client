package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-11T08:06:02.600Z")
public class SoftwareComponent   {
  
  private String name = null;
  private String parentId = null;
  private String version = null;
  private String guid = null;
  private String compType = null;

  
  /**
   **/
  public SoftwareComponent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public SoftwareComponent parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  
  /**
   **/
  public SoftwareComponent version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  public SoftwareComponent guid(String guid) {
    this.guid = guid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("guid")
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  
  /**
   **/
  public SoftwareComponent compType(String compType) {
    this.compType = compType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comp_type")
  public String getCompType() {
    return compType;
  }
  public void setCompType(String compType) {
    this.compType = compType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareComponent softwareComponent = (SoftwareComponent) o;
    return Objects.equals(this.name, softwareComponent.name) &&
        Objects.equals(this.parentId, softwareComponent.parentId) &&
        Objects.equals(this.version, softwareComponent.version) &&
        Objects.equals(this.guid, softwareComponent.guid) &&
        Objects.equals(this.compType, softwareComponent.compType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentId, version, guid, compType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareComponent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    compType: ").append(toIndentedString(compType)).append("\n");
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

