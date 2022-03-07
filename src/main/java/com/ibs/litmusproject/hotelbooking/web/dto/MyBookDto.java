package com.ibs.litmusproject.hotelbooking.web.dto;

public class MyBookDto {
    private int bookingId;
    private String hotelName;
    private String location;
    private String checkIn;
    private String checkOut;
    private String createdDate;
    public MyBookDto() {
    }

    public MyBookDto(int bookingId, String hotelName, String location, String checkIn, String checkOut, String createdDate) {
        this.bookingId = bookingId;
        this.hotelName = hotelName;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.createdDate = createdDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
