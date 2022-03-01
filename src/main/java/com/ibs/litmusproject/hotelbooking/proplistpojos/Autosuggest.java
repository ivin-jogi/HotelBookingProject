
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalUrlParams"
})
@Generated("jsonschema2pojo")
public class Autosuggest {

    @JsonProperty("additionalUrlParams")
    private AdditionalUrlParams additionalUrlParams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("additionalUrlParams")
    public AdditionalUrlParams getAdditionalUrlParams() {
        return additionalUrlParams;
    }

    @JsonProperty("additionalUrlParams")
    public void setAdditionalUrlParams(AdditionalUrlParams additionalUrlParams) {
        this.additionalUrlParams = additionalUrlParams;
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
