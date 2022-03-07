package com.ibs.litmusproject.hotelbooking.web.dto;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class CheckOutUserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String passengers;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkIn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkOut;
    private Date createdDate;
    private String userId;
    private String hotelId;

    public CheckOutUserDto() {
    }

    public CheckOutUserDto(String firstName, String lastName, String email, String mobile,
                           String passengers, Date checkIn, Date checkOut, Date createdDate, String userId,
                           String hotelId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.passengers = passengers;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.createdDate = createdDate;
        this.userId = userId;
        this.hotelId = hotelId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
}
