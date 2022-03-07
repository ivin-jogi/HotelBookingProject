package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;
//to fetch location
public class PdpHeaderdto {
    private String destinationId;
    private HotelLocationDto hotelLocationDto;

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public HotelLocationDto getHotelLocationDto() {
        return hotelLocationDto;
    }

    public void setHotelLocationDto(HotelLocationDto hotelLocationDto) {
        this.hotelLocationDto = hotelLocationDto;
    }

    @Override
    public String toString() {
        return "PdpHeaderdto{" +
                "destinationId='" + destinationId + '\'' +
                ", hotelLocationDto=" + hotelLocationDto +
                '}';
    }
}
