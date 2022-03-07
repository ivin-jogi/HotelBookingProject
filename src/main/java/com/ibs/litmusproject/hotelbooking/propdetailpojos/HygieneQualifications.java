
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "qualifications"
})
@Generated("jsonschema2pojo")
public class HygieneQualifications {

    @JsonProperty("title")
    private String title;
    @JsonProperty("qualifications")
    private List<String> qualifications = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("qualifications")
    public List<String> getQualifications() {
        return qualifications;
    }

    @JsonProperty("qualifications")
    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
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
