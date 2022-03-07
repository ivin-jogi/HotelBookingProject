
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelSize",
    "arrivingLeaving",
    "specialCheckInInstructions",
    "requiredAtCheckIn"
})
@Generated("jsonschema2pojo")
public class KeyFacts {

    @JsonProperty("hotelSize")
    private List<String> hotelSize = null;
    @JsonProperty("arrivingLeaving")
    private List<String> arrivingLeaving = null;
    @JsonProperty("specialCheckInInstructions")
    private List<String> specialCheckInInstructions = null;
    @JsonProperty("requiredAtCheckIn")
    private List<String> requiredAtCheckIn = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hotelSize")
    public List<String> getHotelSize() {
        return hotelSize;
    }

    @JsonProperty("hotelSize")
    public void setHotelSize(List<String> hotelSize) {
        this.hotelSize = hotelSize;
    }

    @JsonProperty("arrivingLeaving")
    public List<String> getArrivingLeaving() {
        return arrivingLeaving;
    }

    @JsonProperty("arrivingLeaving")
    public void setArrivingLeaving(List<String> arrivingLeaving) {
        this.arrivingLeaving = arrivingLeaving;
    }

    @JsonProperty("specialCheckInInstructions")
    public List<String> getSpecialCheckInInstructions() {
        return specialCheckInInstructions;
    }

    @JsonProperty("specialCheckInInstructions")
    public void setSpecialCheckInInstructions(List<String> specialCheckInInstructions) {
        this.specialCheckInInstructions = specialCheckInInstructions;
    }

    @JsonProperty("requiredAtCheckIn")
    public List<String> getRequiredAtCheckIn() {
        return requiredAtCheckIn;
    }

    @JsonProperty("requiredAtCheckIn")
    public void setRequiredAtCheckIn(List<String> requiredAtCheckIn) {
        this.requiredAtCheckIn = requiredAtCheckIn;
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
