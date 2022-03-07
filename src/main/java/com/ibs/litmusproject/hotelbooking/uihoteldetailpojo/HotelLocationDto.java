package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

public class HotelLocationDto {

    String locationName;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Override
    public String toString() {
        return "HotelLocationDto{" +
                "locationName='" + locationName + '\'' +
                '}';
    }
}
