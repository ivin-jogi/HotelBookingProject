
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelBadge"
})
@Generated("jsonschema2pojo")
public class Badging {

    @JsonProperty("hotelBadge")
    private HotelBadge hotelBadge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hotelBadge")
    public HotelBadge getHotelBadge() {
        return hotelBadge;
    }

    @JsonProperty("hotelBadge")
    public void setHotelBadge(HotelBadge hotelBadge) {
        this.hotelBadge = hotelBadge;
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
