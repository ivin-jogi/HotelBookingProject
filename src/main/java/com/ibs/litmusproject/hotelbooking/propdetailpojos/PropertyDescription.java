
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientToken",
    "address",
    "priceMatchEnabled",
    "name",
    "starRatingTitle",
    "starRating",
    "featuredPrice",
    "mapWidget",
    "roomTypeNames",
    "tagline",
    "freebies"
})
@Generated("jsonschema2pojo")
public class PropertyDescription {

    @JsonProperty("clientToken")
    private String clientToken;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("priceMatchEnabled")
    private Boolean priceMatchEnabled;
    @JsonProperty("name")
    private String name;
    @JsonProperty("starRatingTitle")
    private String starRatingTitle;
    @JsonProperty("starRating")
    private Integer starRating;
    @JsonProperty("featuredPrice")
    private FeaturedPrice featuredPrice;
    @JsonProperty("mapWidget")
    private MapWidget mapWidget;
    @JsonProperty("roomTypeNames")
    private List<String> roomTypeNames = null;
    @JsonProperty("tagline")
    private List<String> tagline = null;
    @JsonProperty("freebies")
    private List<String> freebies = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientToken")
    public String getClientToken() {
        return clientToken;
    }

    @JsonProperty("clientToken")
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("priceMatchEnabled")
    public Boolean getPriceMatchEnabled() {
        return priceMatchEnabled;
    }

    @JsonProperty("priceMatchEnabled")
    public void setPriceMatchEnabled(Boolean priceMatchEnabled) {
        this.priceMatchEnabled = priceMatchEnabled;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("starRatingTitle")
    public String getStarRatingTitle() {
        return starRatingTitle;
    }

    @JsonProperty("starRatingTitle")
    public void setStarRatingTitle(String starRatingTitle) {
        this.starRatingTitle = starRatingTitle;
    }

    @JsonProperty("starRating")
    public Integer getStarRating() {
        return starRating;
    }

    @JsonProperty("starRating")
    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    @JsonProperty("featuredPrice")
    public FeaturedPrice getFeaturedPrice() {
        return featuredPrice;
    }

    @JsonProperty("featuredPrice")
    public void setFeaturedPrice(FeaturedPrice featuredPrice) {
        this.featuredPrice = featuredPrice;
    }

    @JsonProperty("mapWidget")
    public MapWidget getMapWidget() {
        return mapWidget;
    }

    @JsonProperty("mapWidget")
    public void setMapWidget(MapWidget mapWidget) {
        this.mapWidget = mapWidget;
    }

    @JsonProperty("roomTypeNames")
    public List<String> getRoomTypeNames() {
        return roomTypeNames;
    }

    @JsonProperty("roomTypeNames")
    public void setRoomTypeNames(List<String> roomTypeNames) {
        this.roomTypeNames = roomTypeNames;
    }

    @JsonProperty("tagline")
    public List<String> getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(List<String> tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("freebies")
    public List<String> getFreebies() {
        return freebies;
    }

    @JsonProperty("freebies")
    public void setFreebies(List<String> freebies) {
        this.freebies = freebies;
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
