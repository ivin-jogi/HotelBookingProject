
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "heading",
    "freeText",
    "listItems",
    "subsections"
})
@Generated("jsonschema2pojo")
public class Section {

    @JsonProperty("heading")
    private String heading;
    @JsonProperty("freeText")
    private String freeText;
    @JsonProperty("listItems")
    private List<Object> listItems = null;
    @JsonProperty("subsections")
    private List<Object> subsections = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("heading")
    public String getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(String heading) {
        this.heading = heading;
    }

    @JsonProperty("freeText")
    public String getFreeText() {
        return freeText;
    }

    @JsonProperty("freeText")
    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    @JsonProperty("listItems")
    public List<Object> getListItems() {
        return listItems;
    }

    @JsonProperty("listItems")
    public void setListItems(List<Object> listItems) {
        this.listItems = listItems;
    }

    @JsonProperty("subsections")
    public List<Object> getSubsections() {
        return subsections;
    }

    @JsonProperty("subsections")
    public void setSubsections(List<Object> subsections) {
        this.subsections = subsections;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
