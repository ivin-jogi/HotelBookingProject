
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overviewSections"
})
@Generated("jsonschema2pojo")
public class Overview {

    @JsonProperty("overviewSections")
    private List<OverviewSection> overviewSections = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("overviewSections")
    public List<OverviewSection> getOverviewSections() {
        return overviewSections;
    }

    @JsonProperty("overviewSections")
    public void setOverviewSections(List<OverviewSection> overviewSections) {
        this.overviewSections = overviewSections;
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
