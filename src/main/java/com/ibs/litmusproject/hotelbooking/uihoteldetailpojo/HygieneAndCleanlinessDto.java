package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;

public class HygieneAndCleanlinessDto {
    private String title;

    private HealthAndSafetyMeasuresDto healthAndSafetyMeasures;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HealthAndSafetyMeasuresDto getHealthAndSafetyMeasures() {
        return healthAndSafetyMeasures;
    }

    public void setHealthAndSafetyMeasures(HealthAndSafetyMeasuresDto healthAndSafetyMeasures) {
        this.healthAndSafetyMeasures = healthAndSafetyMeasures;
    }

    @Override
    public String toString() {
        return "HygieneAndCleanliness{" +
                "title='" + title + '\'' +
                ", hygieneQualifications=" + healthAndSafetyMeasures +
                '}';
    }
}
