
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportLocations"
})
@Generated("jsonschema2pojo")
public class Transportation {

    @JsonProperty("transportLocations")
    private List<TransportLocation> transportLocations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("transportLocations")
    public List<TransportLocation> getTransportLocations() {
        return transportLocations;
    }

    @JsonProperty("transportLocations")
    public void setTransportLocations(List<TransportLocation> transportLocations) {
        this.transportLocations = transportLocations;
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
