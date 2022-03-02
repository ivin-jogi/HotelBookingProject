package com.ibs.litmusproject.hotelbooking.searchlistuipojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Hotel {
    private Long id;
private String name;
private Float starRating;
private List<Address> address;

    public Hotel() {
    }

    public Hotel(Long id, String name, Float starRating, List<Address> address) {
        this.id=id;
        this.name = name;
        this.starRating = starRating;
        this.address = address;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getStarRating() {
        return starRating;
    }

    public void setStarRating(Float starRating) {
        this.starRating = starRating;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", starRating=" + starRating +
                ", address=" + address +
                '}';
    }
}
