
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resolved-location",
    "q-destination",
    "destination-id"
})
@Generated("jsonschema2pojo")
public class AdditionalUrlParams {

    @JsonProperty("resolved-location")
    private String resolvedLocation;
    @JsonProperty("q-destination")
    private String qDestination;
    @JsonProperty("destination-id")
    private String destinationId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resolved-location")
    public String getResolvedLocation() {
        return resolvedLocation;
    }

    @JsonProperty("resolved-location")
    public void setResolvedLocation(String resolvedLocation) {
        this.resolvedLocation = resolvedLocation;
    }

    @JsonProperty("q-destination")
    public String getqDestination() {
        return qDestination;
    }

    @JsonProperty("q-destination")
    public void setqDestination(String qDestination) {
        this.qDestination = qDestination;
    }

    @JsonProperty("destination-id")
    public String getDestinationId() {
        return destinationId;
    }

    @JsonProperty("destination-id")
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
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
