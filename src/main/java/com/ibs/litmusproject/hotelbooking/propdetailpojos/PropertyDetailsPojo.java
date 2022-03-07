
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "data",
    "transportation",
    "neighborhood"
})
@Generated("jsonschema2pojo")
public class PropertyDetailsPojo {

    @JsonProperty("result")
    private String result;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("transportation")
    private Transportation transportation;
    @JsonProperty("neighborhood")
    private Neighborhood neighborhood;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("transportation")
    public Transportation getTransportation() {
        return transportation;
    }

    @JsonProperty("transportation")
    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    @JsonProperty("neighborhood")
    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty("neighborhood")
    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
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
