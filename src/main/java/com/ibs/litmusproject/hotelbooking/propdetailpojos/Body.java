
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pdpHeader",
    "overview",
    "hotelWelcomeRewards",
    "propertyDescription",
    "guestReviews",
    "atAGlance",
    "amenities",
    "hygieneAndCleanliness",
    "smallPrint",
    "specialFeatures",
    "miscellaneous",
    "pageInfo",
    "hotelBadge",
    "unavailable"
})
@Generated("jsonschema2pojo")
public class Body {

    @JsonProperty("pdpHeader")
    private PdpHeader pdpHeader;
    @JsonProperty("overview")
    private Overview overview;
    @JsonProperty("hotelWelcomeRewards")
    private HotelWelcomeRewards hotelWelcomeRewards;
    @JsonProperty("propertyDescription")
    private PropertyDescription propertyDescription;
    @JsonProperty("guestReviews")
    private GuestReviews guestReviews;
    @JsonProperty("atAGlance")
    private AtAGlance atAGlance;
    @JsonProperty("amenities")
    private List<Amenity> amenities = null;
    @JsonProperty("hygieneAndCleanliness")
    private HygieneAndCleanliness hygieneAndCleanliness;
    @JsonProperty("smallPrint")
    private SmallPrint smallPrint;
    @JsonProperty("specialFeatures")
    private SpecialFeatures specialFeatures;
    @JsonProperty("miscellaneous")
    private Miscellaneous miscellaneous;
    @JsonProperty("pageInfo")
    private PageInfo pageInfo;
    @JsonProperty("hotelBadge")
    private HotelBadge hotelBadge;
    @JsonProperty("unavailable")
    private Unavailable unavailable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pdpHeader")
    public PdpHeader getPdpHeader() {
        return pdpHeader;
    }

    @JsonProperty("pdpHeader")
    public void setPdpHeader(PdpHeader pdpHeader) {
        this.pdpHeader = pdpHeader;
    }

    @JsonProperty("overview")
    public Overview getOverview() {
        return overview;
    }

    @JsonProperty("overview")
    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    @JsonProperty("hotelWelcomeRewards")
    public HotelWelcomeRewards getHotelWelcomeRewards() {
        return hotelWelcomeRewards;
    }

    @JsonProperty("hotelWelcomeRewards")
    public void setHotelWelcomeRewards(HotelWelcomeRewards hotelWelcomeRewards) {
        this.hotelWelcomeRewards = hotelWelcomeRewards;
    }

    @JsonProperty("propertyDescription")
    public PropertyDescription getPropertyDescription() {
        return propertyDescription;
    }

    @JsonProperty("propertyDescription")
    public void setPropertyDescription(PropertyDescription propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    @JsonProperty("guestReviews")
    public GuestReviews getGuestReviews() {
        return guestReviews;
    }

    @JsonProperty("guestReviews")
    public void setGuestReviews(GuestReviews guestReviews) {
        this.guestReviews = guestReviews;
    }

    @JsonProperty("atAGlance")
    public AtAGlance getAtAGlance() {
        return atAGlance;
    }

    @JsonProperty("atAGlance")
    public void setAtAGlance(AtAGlance atAGlance) {
        this.atAGlance = atAGlance;
    }

    @JsonProperty("amenities")
    public List<Amenity> getAmenities() {
        return amenities;
    }

    @JsonProperty("amenities")
    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("hygieneAndCleanliness")
    public HygieneAndCleanliness getHygieneAndCleanliness() {
        return hygieneAndCleanliness;
    }

    @JsonProperty("hygieneAndCleanliness")
    public void setHygieneAndCleanliness(HygieneAndCleanliness hygieneAndCleanliness) {
        this.hygieneAndCleanliness = hygieneAndCleanliness;
    }

    @JsonProperty("smallPrint")
    public SmallPrint getSmallPrint() {
        return smallPrint;
    }

    @JsonProperty("smallPrint")
    public void setSmallPrint(SmallPrint smallPrint) {
        this.smallPrint = smallPrint;
    }

    @JsonProperty("specialFeatures")
    public SpecialFeatures getSpecialFeatures() {
        return specialFeatures;
    }

    @JsonProperty("specialFeatures")
    public void setSpecialFeatures(SpecialFeatures specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @JsonProperty("miscellaneous")
    public Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    @JsonProperty("miscellaneous")
    public void setMiscellaneous(Miscellaneous miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @JsonProperty("pageInfo")
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    @JsonProperty("pageInfo")
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @JsonProperty("hotelBadge")
    public HotelBadge getHotelBadge() {
        return hotelBadge;
    }

    @JsonProperty("hotelBadge")
    public void setHotelBadge(HotelBadge hotelBadge) {
        this.hotelBadge = hotelBadge;
    }

    @JsonProperty("unavailable")
    public Unavailable getUnavailable() {
        return unavailable;
    }

    @JsonProperty("unavailable")
    public void setUnavailable(Unavailable unavailable) {
        this.unavailable = unavailable;
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
