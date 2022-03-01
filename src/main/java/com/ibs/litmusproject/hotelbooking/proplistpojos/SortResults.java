
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "options",
    "distanceOptionLandmarkId"
})
@Generated("jsonschema2pojo")
public class SortResults {

    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("distanceOptionLandmarkId")
    private Integer distanceOptionLandmarkId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("distanceOptionLandmarkId")
    public Integer getDistanceOptionLandmarkId() {
        return distanceOptionLandmarkId;
    }

    @JsonProperty("distanceOptionLandmarkId")
    public void setDistanceOptionLandmarkId(Integer distanceOptionLandmarkId) {
        this.distanceOptionLandmarkId = distanceOptionLandmarkId;
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
