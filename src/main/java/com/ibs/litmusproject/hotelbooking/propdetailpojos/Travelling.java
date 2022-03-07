
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "children",
    "pets",
    "extraPeople"
})
@Generated("jsonschema2pojo")
public class Travelling {

    @JsonProperty("children")
    private List<Object> children = null;
    @JsonProperty("pets")
    private List<String> pets = null;
    @JsonProperty("extraPeople")
    private List<Object> extraPeople = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("children")
    public List<Object> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Object> children) {
        this.children = children;
    }

    @JsonProperty("pets")
    public List<String> getPets() {
        return pets;
    }

    @JsonProperty("pets")
    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @JsonProperty("extraPeople")
    public List<Object> getExtraPeople() {
        return extraPeople;
    }

    @JsonProperty("extraPeople")
    public void setExtraPeople(List<Object> extraPeople) {
        this.extraPeople = extraPeople;
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
