
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omniture",
    "pageViewBeaconUrl"
})
@Generated("jsonschema2pojo")
public class Tracking {

    @JsonProperty("omniture")
    private Omniture omniture;
    @JsonProperty("pageViewBeaconUrl")
    private String pageViewBeaconUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("omniture")
    public Omniture getOmniture() {
        return omniture;
    }

    @JsonProperty("omniture")
    public void setOmniture(Omniture omniture) {
        this.omniture = omniture;
    }

    @JsonProperty("pageViewBeaconUrl")
    public String getPageViewBeaconUrl() {
        return pageViewBeaconUrl;
    }

    @JsonProperty("pageViewBeaconUrl")
    public void setPageViewBeaconUrl(String pageViewBeaconUrl) {
        this.pageViewBeaconUrl = pageViewBeaconUrl;
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
