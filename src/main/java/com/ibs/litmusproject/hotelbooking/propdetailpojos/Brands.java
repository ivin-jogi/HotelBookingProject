
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scale",
    "formattedScale",
    "rating",
    "formattedRating",
    "lowRating",
    "badgeText",
    "total"
})
@Generated("jsonschema2pojo")
public class Brands {

    @JsonProperty("scale")
    private Integer scale;
    @JsonProperty("formattedScale")
    private String formattedScale;
    @JsonProperty("rating")
    private Double rating;
    @JsonProperty("formattedRating")
    private String formattedRating;
    @JsonProperty("lowRating")
    private Boolean lowRating;
    @JsonProperty("badgeText")
    private String badgeText;
    @JsonProperty("total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @JsonProperty("formattedScale")
    public String getFormattedScale() {
        return formattedScale;
    }

    @JsonProperty("formattedScale")
    public void setFormattedScale(String formattedScale) {
        this.formattedScale = formattedScale;
    }

    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @JsonProperty("formattedRating")
    public String getFormattedRating() {
        return formattedRating;
    }

    @JsonProperty("formattedRating")
    public void setFormattedRating(String formattedRating) {
        this.formattedRating = formattedRating;
    }

    @JsonProperty("lowRating")
    public Boolean getLowRating() {
        return lowRating;
    }

    @JsonProperty("lowRating")
    public void setLowRating(Boolean lowRating) {
        this.lowRating = lowRating;
    }

    @JsonProperty("badgeText")
    public String getBadgeText() {
        return badgeText;
    }

    @JsonProperty("badgeText")
    public void setBadgeText(String badgeText) {
        this.badgeText = badgeText;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
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
