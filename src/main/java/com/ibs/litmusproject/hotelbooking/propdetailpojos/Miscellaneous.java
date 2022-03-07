
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pimmsAttributes",
    "showLegalInfoForStrikethroughPrices",
    "legalInfoForStrikethroughPrices"
})
@Generated("jsonschema2pojo")
public class Miscellaneous {

    @JsonProperty("pimmsAttributes")
    private String pimmsAttributes;
    @JsonProperty("showLegalInfoForStrikethroughPrices")
    private Boolean showLegalInfoForStrikethroughPrices;
    @JsonProperty("legalInfoForStrikethroughPrices")
    private String legalInfoForStrikethroughPrices;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pimmsAttributes")
    public String getPimmsAttributes() {
        return pimmsAttributes;
    }

    @JsonProperty("pimmsAttributes")
    public void setPimmsAttributes(String pimmsAttributes) {
        this.pimmsAttributes = pimmsAttributes;
    }

    @JsonProperty("showLegalInfoForStrikethroughPrices")
    public Boolean getShowLegalInfoForStrikethroughPrices() {
        return showLegalInfoForStrikethroughPrices;
    }

    @JsonProperty("showLegalInfoForStrikethroughPrices")
    public void setShowLegalInfoForStrikethroughPrices(Boolean showLegalInfoForStrikethroughPrices) {
        this.showLegalInfoForStrikethroughPrices = showLegalInfoForStrikethroughPrices;
    }

    @JsonProperty("legalInfoForStrikethroughPrices")
    public String getLegalInfoForStrikethroughPrices() {
        return legalInfoForStrikethroughPrices;
    }

    @JsonProperty("legalInfoForStrikethroughPrices")
    public void setLegalInfoForStrikethroughPrices(String legalInfoForStrikethroughPrices) {
        this.legalInfoForStrikethroughPrices = legalInfoForStrikethroughPrices;
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
