
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelId",
    "destinationId",
    "pointOfSaleId",
    "currencyCode",
    "occupancyKey",
    "hotelLocation"
})
@Generated("jsonschema2pojo")
public class PdpHeader {

    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("destinationId")
    private String destinationId;
    @JsonProperty("pointOfSaleId")
    private String pointOfSaleId;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("occupancyKey")
    private String occupancyKey;
    @JsonProperty("hotelLocation")
    private HotelLocation hotelLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hotelId")
    public String getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotelId")
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @JsonProperty("destinationId")
    public String getDestinationId() {
        return destinationId;
    }

    @JsonProperty("destinationId")
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    @JsonProperty("pointOfSaleId")
    public String getPointOfSaleId() {
        return pointOfSaleId;
    }

    @JsonProperty("pointOfSaleId")
    public void setPointOfSaleId(String pointOfSaleId) {
        this.pointOfSaleId = pointOfSaleId;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("occupancyKey")
    public String getOccupancyKey() {
        return occupancyKey;
    }

    @JsonProperty("occupancyKey")
    public void setOccupancyKey(String occupancyKey) {
        this.occupancyKey = occupancyKey;
    }

    @JsonProperty("hotelLocation")
    public HotelLocation getHotelLocation() {
        return hotelLocation;
    }

    @JsonProperty("hotelLocation")
    public void setHotelLocation(HotelLocation hotelLocation) {
        this.hotelLocation = hotelLocation;
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
