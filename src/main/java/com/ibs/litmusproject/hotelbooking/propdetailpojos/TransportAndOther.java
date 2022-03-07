
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transport",
    "otherInformation",
    "otherInclusions"
})
@Generated("jsonschema2pojo")
public class TransportAndOther {

    @JsonProperty("transport")
    private Transport transport;
    @JsonProperty("otherInformation")
    private List<String> otherInformation = null;
    @JsonProperty("otherInclusions")
    private List<Object> otherInclusions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("transport")
    public Transport getTransport() {
        return transport;
    }

    @JsonProperty("transport")
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @JsonProperty("otherInformation")
    public List<String> getOtherInformation() {
        return otherInformation;
    }

    @JsonProperty("otherInformation")
    public void setOtherInformation(List<String> otherInformation) {
        this.otherInformation = otherInformation;
    }

    @JsonProperty("otherInclusions")
    public List<Object> getOtherInclusions() {
        return otherInclusions;
    }

    @JsonProperty("otherInclusions")
    public void setOtherInclusions(List<Object> otherInclusions) {
        this.otherInclusions = otherInclusions;
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
