
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pageType",
    "errors",
    "errorKeys"
})
@Generated("jsonschema2pojo")
public class PageInfo {

    @JsonProperty("pageType")
    private String pageType;
    @JsonProperty("errors")
    private List<Error> errors = null;
    @JsonProperty("errorKeys")
    private List<String> errorKeys = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pageType")
    public String getPageType() {
        return pageType;
    }

    @JsonProperty("pageType")
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @JsonProperty("errors")
    public List<Error> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @JsonProperty("errorKeys")
    public List<String> getErrorKeys() {
        return errorKeys;
    }

    @JsonProperty("errorKeys")
    public void setErrorKeys(List<String> errorKeys) {
        this.errorKeys = errorKeys;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
