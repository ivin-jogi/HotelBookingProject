package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;
//section class
public class SectionsDto {
    private String heading;
    private String freeText;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    @Override
    public String toString() {
        return "Sections{" +
                "heading='" + heading + '\'' +
                ", freeText='" + freeText + '\'' +
                '}';
    }
}
