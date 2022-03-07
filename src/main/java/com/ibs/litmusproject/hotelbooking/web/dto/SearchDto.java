package com.ibs.litmusproject.hotelbooking.web.dto;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchDto {

    private String destinationId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String checkIn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String checkOut;
    private String adults;

    public SearchDto() {
    }

    public SearchDto(String destinationId, String checkIn, String checkOut, String adults) {
        this.destinationId = destinationId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.adults = adults;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

}
