package com.ibs.litmusproject.hotelbooking.web.dto;

import com.ibs.litmusproject.hotelbooking.searchlistuipojo.Address;
import java.util.List;

public class SearchResultDto {

    private String Id;
    private String hotelRating;
    private String hotelName;
    private List<Address> address;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SearchResultDto{" +
                "Id='" + Id + '\'' +

                ", hotelRating='" + hotelRating + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", address=" + address +
                '}';
    }
}
