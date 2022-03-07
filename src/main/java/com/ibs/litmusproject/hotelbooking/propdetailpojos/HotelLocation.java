
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coordinates",
    "resolvedLocation",
    "locationName"
})
@Generated("jsonschema2pojo")
public class HotelLocation {

    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonProperty("resolvedLocation")
    private String resolvedLocation;
    @JsonProperty("locationName")
    private String locationName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("resolvedLocation")
    public String getResolvedLocation() {
        return resolvedLocation;
    }

    @JsonProperty("resolvedLocation")
    public void setResolvedLocation(String resolvedLocation) {
        this.resolvedLocation = resolvedLocation;
    }

    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
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
