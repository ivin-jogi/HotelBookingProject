package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//feature detail class
public class SpecialFeaturesDto {
    private List<SectionsDto> sections;

    public List<SectionsDto> getSections() {
        return sections;
    }

    public void setSections(List<SectionsDto> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "SpecialFeatures{" +
                "sections=" + sections +
                '}';
    }
}
