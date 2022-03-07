package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;

public class AmenitiesDto {
    private String heading;
    private List<ListItemsDto> listItems;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<ListItemsDto> getListItems() {
        return listItems;
    }

    public void setListItems(List<ListItemsDto> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        return "Amenities{" +
                "heading='" + heading + '\'' +
                ", listItems=" + listItems +
                '}';
    }
}
