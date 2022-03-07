
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberSeparators",
    "brandName"
})
@Generated("jsonschema2pojo")
public class PointOfSale {

    @JsonProperty("numberSeparators")
    private String numberSeparators;
    @JsonProperty("brandName")
    private String brandName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numberSeparators")
    public String getNumberSeparators() {
        return numberSeparators;
    }

    @JsonProperty("numberSeparators")
    public void setNumberSeparators(String numberSeparators) {
        this.numberSeparators = numberSeparators;
    }

    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
