
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentPage",
    "pageGroup",
    "nextPageStartIndex",
    "nextPageNumber",
    "nextPageGroup"
})
@Generated("jsonschema2pojo")
public class Pagination {

    @JsonProperty("currentPage")
    private Integer currentPage;
    @JsonProperty("pageGroup")
    private String pageGroup;
    @JsonProperty("nextPageStartIndex")
    private Integer nextPageStartIndex;
    @JsonProperty("nextPageNumber")
    private Integer nextPageNumber;
    @JsonProperty("nextPageGroup")
    private String nextPageGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currentPage")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("currentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("pageGroup")
    public String getPageGroup() {
        return pageGroup;
    }

    @JsonProperty("pageGroup")
    public void setPageGroup(String pageGroup) {
        this.pageGroup = pageGroup;
    }

    @JsonProperty("nextPageStartIndex")
    public Integer getNextPageStartIndex() {
        return nextPageStartIndex;
    }

    @JsonProperty("nextPageStartIndex")
    public void setNextPageStartIndex(Integer nextPageStartIndex) {
        this.nextPageStartIndex = nextPageStartIndex;
    }

    @JsonProperty("nextPageNumber")
    public Integer getNextPageNumber() {
        return nextPageNumber;
    }

    @JsonProperty("nextPageNumber")
    public void setNextPageNumber(Integer nextPageNumber) {
        this.nextPageNumber = nextPageNumber;
    }

    @JsonProperty("nextPageGroup")
    public String getNextPageGroup() {
        return nextPageGroup;
    }

    @JsonProperty("nextPageGroup")
    public void setNextPageGroup(String nextPageGroup) {
        this.nextPageGroup = nextPageGroup;
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
