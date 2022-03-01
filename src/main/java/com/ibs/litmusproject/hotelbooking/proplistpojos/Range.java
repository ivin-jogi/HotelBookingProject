
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "min",
    "max",
    "increments"
})
@Generated("jsonschema2pojo")
public class Range {

    @JsonProperty("min")
    private Min min;
    @JsonProperty("max")
    private Max max;
    @JsonProperty("increments")
    private Integer increments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("min")
    public Min getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Min min) {
        this.min = min;
    }

    @JsonProperty("max")
    public Max getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Max max) {
        this.max = max;
    }

    @JsonProperty("increments")
    public Integer getIncrements() {
        return increments;
    }

    @JsonProperty("increments")
    public void setIncrements(Integer increments) {
        this.increments = increments;
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
