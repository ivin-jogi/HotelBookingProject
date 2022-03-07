
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "travelling",
    "internet"
})
@Generated("jsonschema2pojo")
public class TravellingOrInternet {

    @JsonProperty("travelling")
    private Travelling travelling;
    @JsonProperty("internet")
    private List<String> internet = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("travelling")
    public Travelling getTravelling() {
        return travelling;
    }

    @JsonProperty("travelling")
    public void setTravelling(Travelling travelling) {
        this.travelling = travelling;
    }

    @JsonProperty("internet")
    public List<String> getInternet() {
        return internet;
    }

    @JsonProperty("internet")
    public void setInternet(List<String> internet) {
        this.internet = internet;
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
