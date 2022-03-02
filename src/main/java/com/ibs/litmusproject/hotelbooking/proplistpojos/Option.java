
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "label",
    "itemMeta",
    "choices",
    "enhancedChoices",
    "selectedChoiceLabel"
})
@Generated("jsonschema2pojo")
public class Option {

    @JsonProperty("label")
    private String label;
    @JsonProperty("itemMeta")
    private String itemMeta;
    @JsonProperty("choices")
    private List<Choice> choices = null;
    @JsonProperty("enhancedChoices")
    private List<EnhancedChoice> enhancedChoices = null;
    @JsonProperty("selectedChoiceLabel")
    private String selectedChoiceLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("itemMeta")
    public String getItemMeta() {
        return itemMeta;
    }

    @JsonProperty("itemMeta")
    public void setItemMeta(String itemMeta) {
        this.itemMeta = itemMeta;
    }

    @JsonProperty("choices")
    public List<Choice> getChoices() {
        return choices;
    }

    @JsonProperty("choices")
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @JsonProperty("enhancedChoices")
    public List<EnhancedChoice> getEnhancedChoices() {
        return enhancedChoices;
    }

    @JsonProperty("enhancedChoices")
    public void setEnhancedChoices(List<EnhancedChoice> enhancedChoices) {
        this.enhancedChoices = enhancedChoices;
    }

    @JsonProperty("selectedChoiceLabel")
    public String getSelectedChoiceLabel() {
        return selectedChoiceLabel;
    }

    @JsonProperty("selectedChoiceLabel")
    public void setSelectedChoiceLabel(String selectedChoiceLabel) {
        this.selectedChoiceLabel = selectedChoiceLabel;
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
