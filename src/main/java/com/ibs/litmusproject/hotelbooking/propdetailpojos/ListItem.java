
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "heading",
    "listItems"
})
@Generated("jsonschema2pojo")
public class ListItem {

    @JsonProperty("heading")
    private String heading;
    @JsonProperty("listItems")
    private List<String> listItems = null;
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

    @JsonProperty("listItems")
    public List<String> getListItems() {
        return listItems;
    }

    @JsonProperty("listItems")
    public void setListItems(List<String> listItems) {
        this.listItems = listItems;
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
