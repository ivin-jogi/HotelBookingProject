
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "selectedOrder",
    "items",
    "distance"
})
@Generated("jsonschema2pojo")
public class Landmarks {

    @JsonProperty("selectedOrder")
    private List<Object> selectedOrder = null;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("distance")
    private List<Object> distance = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("selectedOrder")
    public List<Object> getSelectedOrder() {
        return selectedOrder;
    }

    @JsonProperty("selectedOrder")
    public void setSelectedOrder(List<Object> selectedOrder) {
        this.selectedOrder = selectedOrder;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("distance")
    public List<Object> getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(List<Object> distance) {
        this.distance = distance;
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
