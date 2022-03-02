
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unformattedRating",
    "rating",
    "total",
    "scale",
    "badge",
    "badgeText"
})
@Generated("jsonschema2pojo")
public class GuestReviews {

    @JsonProperty("unformattedRating")
    private Integer unformattedRating;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("scale")
    private Integer scale;
    @JsonProperty("badge")
    private String badge;
    @JsonProperty("badgeText")
    private String badgeText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unformattedRating")
    public Integer getUnformattedRating() {
        return unformattedRating;
    }

    @JsonProperty("unformattedRating")
    public void setUnformattedRating(Integer unformattedRating) {
        this.unformattedRating = unformattedRating;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("scale")
    public Integer getScale() {
        return scale;
    }

    @JsonProperty("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @JsonProperty("badge")
    public String getBadge() {
        return badge;
    }

    @JsonProperty("badge")
    public void setBadge(String badge) {
        this.badge = badge;
    }

    @JsonProperty("badgeText")
    public String getBadgeText() {
        return badgeText;
    }

    @JsonProperty("badgeText")
    public void setBadgeText(String badgeText) {
        this.badgeText = badgeText;
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
