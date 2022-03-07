package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//hotel detail on travelling
public class TravellingDto {
    private List<String> pets;

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Travelling{" +
                "pets=" + pets +
                '}';
    }
}
