
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "srpDesktop"
})
@Generated("jsonschema2pojo")
public class OptimizedThumbUrls {

    @JsonProperty("srpDesktop")
    private String srpDesktop;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("srpDesktop")
    public String getSrpDesktop() {
        return srpDesktop;
    }

    @JsonProperty("srpDesktop")
    public void setSrpDesktop(String srpDesktop) {
        this.srpDesktop = srpDesktop;
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
