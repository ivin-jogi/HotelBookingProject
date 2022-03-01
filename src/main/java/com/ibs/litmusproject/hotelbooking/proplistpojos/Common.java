
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pointOfSale",
    "tracking"
})
@Generated("jsonschema2pojo")
public class Common {

    @JsonProperty("pointOfSale")
    private PointOfSale__1 pointOfSale;
    @JsonProperty("tracking")
    private Tracking tracking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pointOfSale")
    public PointOfSale__1 getPointOfSale() {
        return pointOfSale;
    }

    @JsonProperty("pointOfSale")
    public void setPointOfSale(PointOfSale__1 pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    @JsonProperty("tracking")
    public Tracking getTracking() {
        return tracking;
    }

    @JsonProperty("tracking")
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
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
