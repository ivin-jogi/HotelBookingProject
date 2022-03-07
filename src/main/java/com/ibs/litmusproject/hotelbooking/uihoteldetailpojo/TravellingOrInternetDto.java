package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//hotel detail on travelling
public class TravellingOrInternetDto {
    private List<TravellingDto> travelling;
    private List<String> internet;

    public List<TravellingDto> getTravelling() {
        return travelling;
    }

    public void setTravelling(List<TravellingDto> travelling) {
        this.travelling = travelling;
    }

    public List<String> getInternet() {
        return internet;
    }

    public void setInternet(List<String> internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "TravellingOrInternet{" +
                "travelling=" + travelling +
                ", internet=" + internet +
                '}';
    }
}
