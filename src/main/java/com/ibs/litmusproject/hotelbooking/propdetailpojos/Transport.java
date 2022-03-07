
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transfers",
    "parking",
    "offsiteTransfer"
})
@Generated("jsonschema2pojo")
public class Transport {

    @JsonProperty("transfers")
    private List<Object> transfers = null;
    @JsonProperty("parking")
    private List<String> parking = null;
    @JsonProperty("offsiteTransfer")
    private List<Object> offsiteTransfer = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("transfers")
    public List<Object> getTransfers() {
        return transfers;
    }

    @JsonProperty("transfers")
    public void setTransfers(List<Object> transfers) {
        this.transfers = transfers;
    }

    @JsonProperty("parking")
    public List<String> getParking() {
        return parking;
    }

    @JsonProperty("parking")
    public void setParking(List<String> parking) {
        this.parking = parking;
    }

    @JsonProperty("offsiteTransfer")
    public List<Object> getOffsiteTransfer() {
        return offsiteTransfer;
    }

    @JsonProperty("offsiteTransfer")
    public void setOffsiteTransfer(List<Object> offsiteTransfer) {
        this.offsiteTransfer = offsiteTransfer;
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
