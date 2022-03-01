
package com.ibs.litmusproject.hotelbooking.proplistpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "query",
    "searchResults",
    "sortResults",
    "filters",
    "pointOfSale",
    "miscellaneous",
    "pageInfo"
})
@Generated("jsonschema2pojo")
public class Body {

    @JsonProperty("header")
    private String header;
    @JsonProperty("query")
    private Query query;
    @JsonProperty("searchResults")
    private SearchResults searchResults;
    @JsonProperty("sortResults")
    private SortResults sortResults;
    @JsonProperty("filters")
    private Filters filters;
    @JsonProperty("pointOfSale")
    private PointOfSale pointOfSale;
    @JsonProperty("miscellaneous")
    private Miscellaneous miscellaneous;
    @JsonProperty("pageInfo")
    private PageInfo pageInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("header")
    public String getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(String header) {
        this.header = header;
    }

    @JsonProperty("query")
    public Query getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(Query query) {
        this.query = query;
    }

    @JsonProperty("searchResults")
    public SearchResults getSearchResults() {
        return searchResults;
    }

    @JsonProperty("searchResults")
    public void setSearchResults(SearchResults searchResults) {
        this.searchResults = searchResults;
    }

    @JsonProperty("sortResults")
    public SortResults getSortResults() {
        return sortResults;
    }

    @JsonProperty("sortResults")
    public void setSortResults(SortResults sortResults) {
        this.sortResults = sortResults;
    }

    @JsonProperty("filters")
    public Filters getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    @JsonProperty("pointOfSale")
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    @JsonProperty("pointOfSale")
    public void setPointOfSale(PointOfSale pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    @JsonProperty("miscellaneous")
    public Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    @JsonProperty("miscellaneous")
    public void setMiscellaneous(Miscellaneous miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @JsonProperty("pageInfo")
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    @JsonProperty("pageInfo")
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
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
