
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countryName",
    "cityName",
    "postalCode",
    "provinceName",
    "addressLine1",
    "countryCode",
    "pattern",
    "fullAddress"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("cityName")
    private String cityName;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("provinceName")
    private String provinceName;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("pattern")
    private String pattern;
    @JsonProperty("fullAddress")
    private String fullAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("provinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("provinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @JsonProperty("fullAddress")
    public String getFullAddress() {
        return fullAddress;
    }

    @JsonProperty("fullAddress")
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
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
