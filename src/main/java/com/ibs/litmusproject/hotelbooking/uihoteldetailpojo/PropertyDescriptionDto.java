package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;


import java.util.List;

public class PropertyDescriptionDto {
//to fetch hotel description
    private String address;
    private String name;
    private String starRatingTitle;
    private FeaturedPriceDto featuredPrice;
    private MapWidgetDto mapWidget;
    private List<String> roomTypeNames;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarRatingTitle() {
        return starRatingTitle;
    }

    public void setStarRatingTitle(String starRatingTitle) {
        this.starRatingTitle = starRatingTitle;
    }


    public FeaturedPriceDto getFeaturedPrice() {
        return featuredPrice;
    }

    public void setFeaturedPrice(FeaturedPriceDto featuredPrice) {
        this.featuredPrice = featuredPrice;
    }

    public MapWidgetDto getMapWidget() {
        return mapWidget;
    }

    public void setMapWidget(MapWidgetDto mapWidget) {
        this.mapWidget = mapWidget;
    }

    public List<String> getRoomTypeNames() {
        return roomTypeNames;
    }

    public void setRoomTypeNames(List<String> roomTypeNames) {
        this.roomTypeNames = roomTypeNames;
    }

    @Override
    public String toString() {
        return "PropertyDescriptionDto{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", starRatingTitle='" + starRatingTitle + '\'' +
                ", featuredPrice=" + featuredPrice +
                ", mapWidget=" + mapWidget +
                ", roomTypeNames=" + roomTypeNames +
                '}';
    }
}

