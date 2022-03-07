
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fieldName",
    "errorMessages"
})
@Generated("jsonschema2pojo")
public class Error {

    @JsonProperty("fieldName")
    private String fieldName;
    @JsonProperty("errorMessages")
    private List<String> errorMessages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fieldName")
    public String getFieldName() {
        return fieldName;
    }

    @JsonProperty("fieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @JsonProperty("errorMessages")
    public List<String> getErrorMessages() {
        return errorMessages;
    }

    @JsonProperty("errorMessages")
    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
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
