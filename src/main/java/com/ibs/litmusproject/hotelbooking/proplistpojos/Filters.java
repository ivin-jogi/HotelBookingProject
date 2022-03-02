
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "applied",
    "name",
    "starRating",
    "guestRating",
    "landmarks",
    "neighbourhood",
    "accommodationType",
    "facilities",
    "accessibility",
    "themesAndTypes",
    "price",
    "paymentPreference",
    "welcomeRewards"
})
@Generated("jsonschema2pojo")
public class Filters {

    @JsonProperty("applied")
    private Boolean applied;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("starRating")
    private StarRating starRating;
    @JsonProperty("guestRating")
    private GuestRating guestRating;
    @JsonProperty("landmarks")
    private Landmarks landmarks;
    @JsonProperty("neighbourhood")
    private Neighbourhood neighbourhood;
    @JsonProperty("accommodationType")
    private AccommodationType accommodationType;
    @JsonProperty("facilities")
    private Facilities facilities;
    @JsonProperty("accessibility")
    private Accessibility accessibility;
    @JsonProperty("themesAndTypes")
    private ThemesAndTypes themesAndTypes;
    @JsonProperty("price")
    private Price__1 price;
    @JsonProperty("paymentPreference")
    private PaymentPreference paymentPreference;
    @JsonProperty("welcomeRewards")
    private WelcomeRewards welcomeRewards;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("applied")
    public Boolean getApplied() {
        return applied;
    }

    @JsonProperty("applied")
    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("starRating")
    public StarRating getStarRating() {
        return starRating;
    }

    @JsonProperty("starRating")
    public void setStarRating(StarRating starRating) {
        this.starRating = starRating;
    }

    @JsonProperty("guestRating")
    public GuestRating getGuestRating() {
        return guestRating;
    }

    @JsonProperty("guestRating")
    public void setGuestRating(GuestRating guestRating) {
        this.guestRating = guestRating;
    }

    @JsonProperty("landmarks")
    public Landmarks getLandmarks() {
        return landmarks;
    }

    @JsonProperty("landmarks")
    public void setLandmarks(Landmarks landmarks) {
        this.landmarks = landmarks;
    }

    @JsonProperty("neighbourhood")
    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    @JsonProperty("neighbourhood")
    public void setNeighbourhood(Neighbourhood neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    @JsonProperty("accommodationType")
    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    @JsonProperty("accommodationType")
    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }

    @JsonProperty("facilities")
    public Facilities getFacilities() {
        return facilities;
    }

    @JsonProperty("facilities")
    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    @JsonProperty("accessibility")
    public Accessibility getAccessibility() {
        return accessibility;
    }

    @JsonProperty("accessibility")
    public void setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
    }

    @JsonProperty("themesAndTypes")
    public ThemesAndTypes getThemesAndTypes() {
        return themesAndTypes;
    }

    @JsonProperty("themesAndTypes")
    public void setThemesAndTypes(ThemesAndTypes themesAndTypes) {
        this.themesAndTypes = themesAndTypes;
    }

    @JsonProperty("price")
    public Price__1 getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price__1 price) {
        this.price = price;
    }

    @JsonProperty("paymentPreference")
    public PaymentPreference getPaymentPreference() {
        return paymentPreference;
    }

    @JsonProperty("paymentPreference")
    public void setPaymentPreference(PaymentPreference paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    @JsonProperty("welcomeRewards")
    public WelcomeRewards getWelcomeRewards() {
        return welcomeRewards;
    }

    @JsonProperty("welcomeRewards")
    public void setWelcomeRewards(WelcomeRewards welcomeRewards) {
        this.welcomeRewards = welcomeRewards;
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
