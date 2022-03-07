
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "label",
    "tooltipTitle",
    "tooltipText"
})
@Generated("jsonschema2pojo")
public class HotelBadge {

    @JsonProperty("type")
    private String type;
    @JsonProperty("label")
    private String label;
    @JsonProperty("tooltipTitle")
    private String tooltipTitle;
    @JsonProperty("tooltipText")
    private String tooltipText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("tooltipTitle")
    public String getTooltipTitle() {
        return tooltipTitle;
    }

    @JsonProperty("tooltipTitle")
    public void setTooltipTitle(String tooltipTitle) {
        this.tooltipTitle = tooltipTitle;
    }

    @JsonProperty("tooltipText")
    public String getTooltipText() {
        return tooltipText;
    }

    @JsonProperty("tooltipText")
    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
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
