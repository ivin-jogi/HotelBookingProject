package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

public class MapWidgetDto {
    private String staticMapurl;

    public String getStaticMapurl() {
        return staticMapurl;
    }

    public void setStaticMapurl(String staticMapurl) {
        this.staticMapurl = staticMapurl;
    }

    @Override
    public String toString() {
        return "MapWidget{" +
                "staticMapurl='" + staticMapurl + '\'' +
                '}';
    }
}
