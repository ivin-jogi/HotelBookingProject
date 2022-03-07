package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//listitem detail class
public class ListItemsDto {
    private String heading;
    private List<String> listItems;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<String> getListItems() {
        return listItems;
    }

    public void setListItems(List<String> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        return "ListItems{" +
                "heading='" + heading + '\'' +
                ", listItems=" + listItems +
                '}';
    }
}
