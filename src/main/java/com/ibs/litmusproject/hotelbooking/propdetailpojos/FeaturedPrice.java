
package com.ibs.litmusproject.hotelbooking.propdetailpojos;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beforePriceText",
    "afterPriceText",
    "pricingAvailability",
    "pricingTooltip",
    "currentPrice",
    "oldPrice",
    "taxInclusiveFormatting",
    "bookNowButton"
})
@Generated("jsonschema2pojo")
public class FeaturedPrice {

    @JsonProperty("beforePriceText")
    private String beforePriceText;
    @JsonProperty("afterPriceText")
    private String afterPriceText;
    @JsonProperty("pricingAvailability")
    private String pricingAvailability;
    @JsonProperty("pricingTooltip")
    private String pricingTooltip;
    @JsonProperty("currentPrice")
    private CurrentPrice currentPrice;
    @JsonProperty("oldPrice")
    private String oldPrice;
    @JsonProperty("taxInclusiveFormatting")
    private Boolean taxInclusiveFormatting;
    @JsonProperty("bookNowButton")
    private Boolean bookNowButton;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("beforePriceText")
    public String getBeforePriceText() {
        return beforePriceText;
    }

    @JsonProperty("beforePriceText")
    public void setBeforePriceText(String beforePriceText) {
        this.beforePriceText = beforePriceText;
    }

    @JsonProperty("afterPriceText")
    public String getAfterPriceText() {
        return afterPriceText;
    }

    @JsonProperty("afterPriceText")
    public void setAfterPriceText(String afterPriceText) {
        this.afterPriceText = afterPriceText;
    }

    @JsonProperty("pricingAvailability")
    public String getPricingAvailability() {
        return pricingAvailability;
    }

    @JsonProperty("pricingAvailability")
    public void setPricingAvailability(String pricingAvailability) {
        this.pricingAvailability = pricingAvailability;
    }

    @JsonProperty("pricingTooltip")
    public String getPricingTooltip() {
        return pricingTooltip;
    }

    @JsonProperty("pricingTooltip")
    public void setPricingTooltip(String pricingTooltip) {
        this.pricingTooltip = pricingTooltip;
    }

    @JsonProperty("currentPrice")
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    @JsonProperty("currentPrice")
    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    @JsonProperty("oldPrice")
    public String getOldPrice() {
        return oldPrice;
    }

    @JsonProperty("oldPrice")
    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    @JsonProperty("taxInclusiveFormatting")
    public Boolean getTaxInclusiveFormatting() {
        return taxInclusiveFormatting;
    }

    @JsonProperty("taxInclusiveFormatting")
    public void setTaxInclusiveFormatting(Boolean taxInclusiveFormatting) {
        this.taxInclusiveFormatting = taxInclusiveFormatting;
    }

    @JsonProperty("bookNowButton")
    public Boolean getBookNowButton() {
        return bookNowButton;
    }

    @JsonProperty("bookNowButton")
    public void setBookNowButton(Boolean bookNowButton) {
        this.bookNowButton = bookNowButton;
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
