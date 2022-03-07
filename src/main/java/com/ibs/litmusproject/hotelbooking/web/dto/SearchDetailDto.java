package com.ibs.litmusproject.hotelbooking.web.dto;

import com.ibs.litmusproject.hotelbooking.uihoteldetailpojo.*;

import java.util.List;
//dto for hotel details
public class SearchDetailDto {

    private String id;
    private PdpHeaderdto pdpheader;
    private OverviewDto overview;
    private List<PropertyDescriptionDto> propertyDescription;
    private List<AtAGlanceDto> atAGlance;
    private List<AmenitiesDto> amenities;
    private List<HygieneAndCleanlinessDto> hygieneAndCleanliness;
    private List<SpecialFeaturesDto> specialFeatures;
    private HotelBadgeDto hotelBadge;

    public SearchDetailDto() {
    }

    public SearchDetailDto(String id, PdpHeaderdto pdpheader, OverviewDto overview, List<PropertyDescriptionDto> propertyDescription, List<AtAGlanceDto> atAGlance, List<AmenitiesDto> amenities, List<HygieneAndCleanlinessDto> hygieneAndCleanliness, List<SpecialFeaturesDto> specialFeatures, HotelBadgeDto hotelBadge) {
        this.id = id;
        this.pdpheader = pdpheader;
        this.overview = overview;
        this.propertyDescription = propertyDescription;
        this.atAGlance = atAGlance;
        this.amenities = amenities;
        this.hygieneAndCleanliness = hygieneAndCleanliness;
        this.specialFeatures = specialFeatures;
        this.hotelBadge = hotelBadge;
    }

    public PdpHeaderdto getPdpheader() {
        return pdpheader;
    }

    public void setPdpheader(PdpHeaderdto pdpheader) {
        this.pdpheader = pdpheader;
    }

    public OverviewDto getOverview() {
        return overview;
    }

    public void setOverview(OverviewDto overview) {
        this.overview = overview;
    }

    public List<PropertyDescriptionDto> getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(List<PropertyDescriptionDto> propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public List<AtAGlanceDto> getAtAGlance() {
        return atAGlance;
    }

    public void setAtAGlance(List<AtAGlanceDto> atAGlance) {
        this.atAGlance = atAGlance;
    }

    public List<AmenitiesDto> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<AmenitiesDto> amenities) {
        this.amenities = amenities;
    }

    public List<HygieneAndCleanlinessDto> getHygieneAndCleanliness() {
        return hygieneAndCleanliness;
    }

    public void setHygieneAndCleanliness(List<HygieneAndCleanlinessDto> hygieneAndCleanliness) {
        this.hygieneAndCleanliness = hygieneAndCleanliness;
    }

    public List<SpecialFeaturesDto> getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(List<SpecialFeaturesDto> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public HotelBadgeDto getHotelBadge() {
        return hotelBadge;
    }

    public void setHotelBadge(HotelBadgeDto hotelBadge) {
        this.hotelBadge = hotelBadge;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HotelInDetail{" +
                "overview=" + overview +
                ", propertyDescription=" + propertyDescription +
                ", atAGlance=" + atAGlance +
                ", amenities=" + amenities +
                ", hygieneAndCleanliness=" + hygieneAndCleanliness +
                ", specialFeatures=" + specialFeatures +
                ", hotelBadge=" + hotelBadge +
                '}';
    }
}
