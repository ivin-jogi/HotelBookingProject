
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "staticMapUrl"
})
@Generated("jsonschema2pojo")
public class MapWidget {

    @JsonProperty("staticMapUrl")
    private String staticMapUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("staticMapUrl")
    public String getStaticMapUrl() {
        return staticMapUrl;
    }

    @JsonProperty("staticMapUrl")
    public void setStaticMapUrl(String staticMapUrl) {
        this.staticMapUrl = staticMapUrl;
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
