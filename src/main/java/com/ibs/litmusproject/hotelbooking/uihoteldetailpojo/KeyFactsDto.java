package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//keyfact details
public class KeyFactsDto {
    private List<String> hotelSize;
    private List<String> arrivingLeaving;
    private List<String> requiredAtCheckIn;

    public List<String> getHotelSize() {
        return hotelSize;
    }

    public void setHotelSize(List<String> hotelSize) {
        this.hotelSize = hotelSize;
    }

    public List<String> getArrivingLeaving() {
        return arrivingLeaving;
    }

    public void setArrivingLeaving(List<String> arrivingLeaving) {
        this.arrivingLeaving = arrivingLeaving;
    }

    public List<String> getRequiredAtCheckIn() {
        return requiredAtCheckIn;
    }

    public void setRequiredAtCheckIn(List<String> requiredAtCheckIn) {
        this.requiredAtCheckIn = requiredAtCheckIn;
    }

    @Override
    public String toString() {
        return "KeyFacts{" +
                "hotelSize=" + hotelSize +
                ", arrivingLeaving=" + arrivingLeaving +
                ", requiredAtCheckIn=" + requiredAtCheckIn +
                '}';
    }
}
