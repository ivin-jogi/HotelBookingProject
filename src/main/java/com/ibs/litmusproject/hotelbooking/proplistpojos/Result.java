
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "starRating",
    "urls",
    "address",
    "guestReviews",
    "landmarks",
    "geoBullets",
    "ratePlan",
    "neighbourhood",
    "deals",
    "messaging",
    "badging",
    "pimmsAttributes",
    "coordinate",
    "providerType",
    "supplierHotelId",
    "vrBadge",
    "isAlternative",
    "optimizedThumbUrls"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private BigInteger id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("starRating")
    private Integer starRating;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("guestReviews")
    private GuestReviews guestReviews;
    @JsonProperty("landmarks")
    private List<Landmark> landmarks = null;
    @JsonProperty("geoBullets")
    private List<Object> geoBullets = null;
    @JsonProperty("ratePlan")
    private RatePlan ratePlan;
    @JsonProperty("neighbourhood")
    private String neighbourhood;
    @JsonProperty("deals")
    private Deals deals;
    @JsonProperty("messaging")
    private Messaging messaging;
    @JsonProperty("badging")
    private Badging badging;
    @JsonProperty("pimmsAttributes")
    private String pimmsAttributes;
    @JsonProperty("coordinate")
    private Coordinate coordinate;
    @JsonProperty("providerType")
    private String providerType;
    @JsonProperty("supplierHotelId")
    private Integer supplierHotelId;
    @JsonProperty("vrBadge")
    private String vrBadge;
    @JsonProperty("isAlternative")
    private Boolean isAlternative;
    @JsonProperty("optimizedThumbUrls")
    private OptimizedThumbUrls optimizedThumbUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public BigInteger getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("starRating")
    public Integer getStarRating() {
        return starRating;
    }

    @JsonProperty("starRating")
    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("guestReviews")
    public GuestReviews getGuestReviews() {
        return guestReviews;
    }

    @JsonProperty("guestReviews")
    public void setGuestReviews(GuestReviews guestReviews) {
        this.guestReviews = guestReviews;
    }

    @JsonProperty("landmarks")
    public List<Landmark> getLandmarks() {
        return landmarks;
    }

    @JsonProperty("landmarks")
    public void setLandmarks(List<Landmark> landmarks) {
        this.landmarks = landmarks;
    }

    @JsonProperty("geoBullets")
    public List<Object> getGeoBullets() {
        return geoBullets;
    }

    @JsonProperty("geoBullets")
    public void setGeoBullets(List<Object> geoBullets) {
        this.geoBullets = geoBullets;
    }

    @JsonProperty("ratePlan")
    public RatePlan getRatePlan() {
        return ratePlan;
    }

    @JsonProperty("ratePlan")
    public void setRatePlan(RatePlan ratePlan) {
        this.ratePlan = ratePlan;
    }

    @JsonProperty("neighbourhood")
    public String getNeighbourhood() {
        return neighbourhood;
    }

    @JsonProperty("neighbourhood")
    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    @JsonProperty("deals")
    public Deals getDeals() {
        return deals;
    }

    @JsonProperty("deals")
    public void setDeals(Deals deals) {
        this.deals = deals;
    }

    @JsonProperty("messaging")
    public Messaging getMessaging() {
        return messaging;
    }

    @JsonProperty("messaging")
    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }

    @JsonProperty("badging")
    public Badging getBadging() {
        return badging;
    }

    @JsonProperty("badging")
    public void setBadging(Badging badging) {
        this.badging = badging;
    }

    @JsonProperty("pimmsAttributes")
    public String getPimmsAttributes() {
        return pimmsAttributes;
    }

    @JsonProperty("pimmsAttributes")
    public void setPimmsAttributes(String pimmsAttributes) {
        this.pimmsAttributes = pimmsAttributes;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @JsonProperty("providerType")
    public String getProviderType() {
        return providerType;
    }

    @JsonProperty("providerType")
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    @JsonProperty("supplierHotelId")
    public Integer getSupplierHotelId() {
        return supplierHotelId;
    }

    @JsonProperty("supplierHotelId")
    public void setSupplierHotelId(Integer supplierHotelId) {
        this.supplierHotelId = supplierHotelId;
    }

    @JsonProperty("vrBadge")
    public String getVrBadge() {
        return vrBadge;
    }

    @JsonProperty("vrBadge")
    public void setVrBadge(String vrBadge) {
        this.vrBadge = vrBadge;
    }

    @JsonProperty("isAlternative")
    public Boolean getIsAlternative() {
        return isAlternative;
    }

    @JsonProperty("isAlternative")
    public void setIsAlternative(Boolean isAlternative) {
        this.isAlternative = isAlternative;
    }

    @JsonProperty("optimizedThumbUrls")
    public OptimizedThumbUrls getOptimizedThumbUrls() {
        return optimizedThumbUrls;
    }

    @JsonProperty("optimizedThumbUrls")
    public void setOptimizedThumbUrls(OptimizedThumbUrls optimizedThumbUrls) {
        this.optimizedThumbUrls = optimizedThumbUrls;
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
