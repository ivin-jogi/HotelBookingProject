package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

public class CurrentPriceDto {

    private String formatted;

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    @Override
    public String toString() {
        return "CurrentPrice{" +
                "formatted='" + formatted + '\'' +
                '}';
    }
}
