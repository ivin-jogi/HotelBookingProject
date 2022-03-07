package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


//overview main class
@JsonIgnoreProperties
public class OverviewDto {
    private String title="overview";
    private List<OverViewSectionDto> overviewSections;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<OverViewSectionDto> getOverviewSections() {
        return overviewSections;
    }

    public void setOverviewSections(List<OverViewSectionDto> overviewSections) {
        this.overviewSections = overviewSections;
    }

    @Override
    public String toString() {
        return "OverviewDto{" +
                "title='" + title + '\'' +
                ", overviewSections=" + overviewSections +
                '}';
    }
}
