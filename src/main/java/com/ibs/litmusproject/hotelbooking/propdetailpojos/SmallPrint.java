
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alternativeNames",
    "mandatoryFees",
    "optionalExtras",
    "policies",
    "mandatoryTaxesOrFees",
    "display"
})
@Generated("jsonschema2pojo")
public class SmallPrint {

    @JsonProperty("alternativeNames")
    private List<String> alternativeNames = null;
    @JsonProperty("mandatoryFees")
    private List<String> mandatoryFees = null;
    @JsonProperty("optionalExtras")
    private List<String> optionalExtras = null;
    @JsonProperty("policies")
    private List<String> policies = null;
    @JsonProperty("mandatoryTaxesOrFees")
    private Boolean mandatoryTaxesOrFees;
    @JsonProperty("display")
    private Boolean display;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alternativeNames")
    public List<String> getAlternativeNames() {
        return alternativeNames;
    }

    @JsonProperty("alternativeNames")
    public void setAlternativeNames(List<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    @JsonProperty("mandatoryFees")
    public List<String> getMandatoryFees() {
        return mandatoryFees;
    }

    @JsonProperty("mandatoryFees")
    public void setMandatoryFees(List<String> mandatoryFees) {
        this.mandatoryFees = mandatoryFees;
    }

    @JsonProperty("optionalExtras")
    public List<String> getOptionalExtras() {
        return optionalExtras;
    }

    @JsonProperty("optionalExtras")
    public void setOptionalExtras(List<String> optionalExtras) {
        this.optionalExtras = optionalExtras;
    }

    @JsonProperty("policies")
    public List<String> getPolicies() {
        return policies;
    }

    @JsonProperty("policies")
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    @JsonProperty("mandatoryTaxesOrFees")
    public Boolean getMandatoryTaxesOrFees() {
        return mandatoryTaxesOrFees;
    }

    @JsonProperty("mandatoryTaxesOrFees")
    public void setMandatoryTaxesOrFees(Boolean mandatoryTaxesOrFees) {
        this.mandatoryTaxesOrFees = mandatoryTaxesOrFees;
    }

    @JsonProperty("display")
    public Boolean getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(Boolean display) {
        this.display = display;
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
