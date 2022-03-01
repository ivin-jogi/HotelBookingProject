
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paymentPreference",
    "noCCRequired"
})
@Generated("jsonschema2pojo")
public class Features {

    @JsonProperty("paymentPreference")
    private Boolean paymentPreference;
    @JsonProperty("noCCRequired")
    private Boolean noCCRequired;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paymentPreference")
    public Boolean getPaymentPreference() {
        return paymentPreference;
    }

    @JsonProperty("paymentPreference")
    public void setPaymentPreference(Boolean paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    @JsonProperty("noCCRequired")
    public Boolean getNoCCRequired() {
        return noCCRequired;
    }

    @JsonProperty("noCCRequired")
    public void setNoCCRequired(Boolean noCCRequired) {
        this.noCCRequired = noCCRequired;
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
