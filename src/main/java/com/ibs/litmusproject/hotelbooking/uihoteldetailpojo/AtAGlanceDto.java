package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;

public class AtAGlanceDto {
    private KeyFactsDto keyFacts;
    private List<TravellingOrInternetDto> travellingOrInternet;


    public KeyFactsDto getKeyFacts() {
        return keyFacts;
    }

    public void setKeyFacts(KeyFactsDto keyFacts) {
        this.keyFacts = keyFacts;
    }

    public List<TravellingOrInternetDto> getTravellingOrInternet() {
        return travellingOrInternet;
    }

    public void setTravellingOrInternet(List<TravellingOrInternetDto> travellingOrInternet) {
        this.travellingOrInternet = travellingOrInternet;
    }


    @Override
    public String toString() {
        return "AtAGlance{" +
                "keyFacts=" + keyFacts +
                ", travelling=" + travellingOrInternet +
                '}';
    }
}
