
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "formatted",
    "plain"
})
@Generated("jsonschema2pojo")
public class CurrentPrice {

    @JsonProperty("formatted")
    private String formatted;
    @JsonProperty("plain")
    private Integer plain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("formatted")
    public String getFormatted() {
        return formatted;
    }

    @JsonProperty("formatted")
    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @JsonProperty("plain")
    public Integer getPlain() {
        return plain;
    }

    @JsonProperty("plain")
    public void setPlain(Integer plain) {
        this.plain = plain;
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
