
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "hygieneQualifications",
    "healthAndSafetyMeasures"
})
@Generated("jsonschema2pojo")
public class HygieneAndCleanliness {

    @JsonProperty("title")
    private String title;
    @JsonProperty("hygieneQualifications")
    private HygieneQualifications hygieneQualifications;
    @JsonProperty("healthAndSafetyMeasures")
    private HealthAndSafetyMeasures healthAndSafetyMeasures;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("hygieneQualifications")
    public HygieneQualifications getHygieneQualifications() {
        return hygieneQualifications;
    }

    @JsonProperty("hygieneQualifications")
    public void setHygieneQualifications(HygieneQualifications hygieneQualifications) {
        this.hygieneQualifications = hygieneQualifications;
    }

    @JsonProperty("healthAndSafetyMeasures")
    public HealthAndSafetyMeasures getHealthAndSafetyMeasures() {
        return healthAndSafetyMeasures;
    }

    @JsonProperty("healthAndSafetyMeasures")
    public void setHealthAndSafetyMeasures(HealthAndSafetyMeasures healthAndSafetyMeasures) {
        this.healthAndSafetyMeasures = healthAndSafetyMeasures;
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
