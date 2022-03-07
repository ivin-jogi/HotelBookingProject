package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;

//suboverview class
public class OverViewSectionDto {
    private String title;
    private String type;
    private List<String> content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "OverViewSection{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", content=" + content +
                '}';
    }
}
