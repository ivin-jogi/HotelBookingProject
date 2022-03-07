
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyFacts",
    "travellingOrInternet",
    "transportAndOther"
})
@Generated("jsonschema2pojo")
public class AtAGlance {

    @JsonProperty("keyFacts")
    private KeyFacts keyFacts;
    @JsonProperty("travellingOrInternet")
    private TravellingOrInternet travellingOrInternet;
    @JsonProperty("transportAndOther")
    private TransportAndOther transportAndOther;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyFacts")
    public KeyFacts getKeyFacts() {
        return keyFacts;
    }

    @JsonProperty("keyFacts")
    public void setKeyFacts(KeyFacts keyFacts) {
        this.keyFacts = keyFacts;
    }

    @JsonProperty("travellingOrInternet")
    public TravellingOrInternet getTravellingOrInternet() {
        return travellingOrInternet;
    }

    @JsonProperty("travellingOrInternet")
    public void setTravellingOrInternet(TravellingOrInternet travellingOrInternet) {
        this.travellingOrInternet = travellingOrInternet;
    }

    @JsonProperty("transportAndOther")
    public TransportAndOther getTransportAndOther() {
        return transportAndOther;
    }

    @JsonProperty("transportAndOther")
    public void setTransportAndOther(TransportAndOther transportAndOther) {
        this.transportAndOther = transportAndOther;
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
