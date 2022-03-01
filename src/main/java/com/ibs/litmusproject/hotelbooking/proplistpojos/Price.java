
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "current",
    "exactCurrent",
    "old"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("current")
    private String current;
    @JsonProperty("exactCurrent")
    private Integer exactCurrent;
    @JsonProperty("old")
    private String old;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current")
    public String getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(String current) {
        this.current = current;
    }

    @JsonProperty("exactCurrent")
    public Integer getExactCurrent() {
        return exactCurrent;
    }

    @JsonProperty("exactCurrent")
    public void setExactCurrent(Integer exactCurrent) {
        this.exactCurrent = exactCurrent;
    }

    @JsonProperty("old")
    public String getOld() {
        return old;
    }

    @JsonProperty("old")
    public void setOld(String old) {
        this.old = old;
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
