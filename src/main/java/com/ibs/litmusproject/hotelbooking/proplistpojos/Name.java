
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item",
    "autosuggest"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("item")
    private Item item;
    @JsonProperty("autosuggest")
    private Autosuggest autosuggest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("autosuggest")
    public Autosuggest getAutosuggest() {
        return autosuggest;
    }

    @JsonProperty("autosuggest")
    public void setAutosuggest(Autosuggest autosuggest) {
        this.autosuggest = autosuggest;
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
