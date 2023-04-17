package com.ibs.litmusproject.hotelbooking.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//hotel table
@Entity
@Table(name = "hotel")
public class Hotel {

    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "hotel_id")
    private String hotelId;

    @Column(name = "hotel_name")
    private String hotelNAme;

    @Column(name = "address")
    private String address;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "checkin_date")
    private Date checkIn;

    @Column(name = "checkout_date")
    private Date checkOut;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "hotel_location",
            joinColumns = {@JoinColumn(name = "hotel_id")},
            inverseJoinColumns = {@JoinColumn(name = "location_id")})
    private List<Location> locations = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(int id, String hotelId, String hotelNAme, String address, String origin,
                 String destination, Date checkIn, Date checkOut,
                 List<Location> locations) {
        this.id = id;
        this.hotelId = hotelId;
        this.hotelNAme = hotelNAme;
        this.address = address;
        this.origin = origin;
        this.destination = destination;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.locations = locations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelNAme() {
        return hotelNAme;
    }

    public void setHotelNAme(String hotelNAme) {
        this.hotelNAme = hotelNAme;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
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

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
