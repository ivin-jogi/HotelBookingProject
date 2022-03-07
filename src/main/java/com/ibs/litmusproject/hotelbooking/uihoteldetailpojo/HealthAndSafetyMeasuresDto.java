package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;
//health measures details
public class HealthAndSafetyMeasuresDto {
    private String title;
    private String description;
    private List<String> measures;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getMeasures() {
        return measures;
    }

    public void setMeasures(List<String> measures) {
        this.measures = measures;
    }

    @Override
    public String toString() {
        return "HygieneQualifications{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", measures=" + measures +
                '}';
    }
}
