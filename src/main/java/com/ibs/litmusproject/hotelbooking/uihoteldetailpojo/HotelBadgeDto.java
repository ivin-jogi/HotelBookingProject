package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

public class HotelBadgeDto {
    private String type;
    private String label;
    private String tooltipTitle;
    private String tooltipText;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTooltipTitle() {
        return tooltipTitle;
    }

    public void setTooltipTitle(String tooltipTitle) {
        this.tooltipTitle = tooltipTitle;
    }

    public String getTooltipText() {
        return tooltipText;
    }

    public void setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    @Override
    public String toString() {
        return "HotelBadge{" +
                "type='" + type + '\'' +
                ", label='" + label + '\'' +
                ", tooltipTitle='" + tooltipTitle + '\'' +
                ", tooltipText='" + tooltipText + '\'' +
                '}';
    }
}
