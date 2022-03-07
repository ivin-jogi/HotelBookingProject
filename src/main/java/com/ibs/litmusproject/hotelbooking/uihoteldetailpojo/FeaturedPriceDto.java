package com.ibs.litmusproject.hotelbooking.uihoteldetailpojo;

import java.util.List;

public class FeaturedPriceDto {
    private String pricingAvailability;
    private CurrentPriceDto currentPrice;

    public String getPricingAvailability() {
        return pricingAvailability;
    }

    public void setPricingAvailability(String pricingAvailability) {
        this.pricingAvailability = pricingAvailability;
    }

    public CurrentPriceDto getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(CurrentPriceDto currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "FeaturedPrice{" +
                "pricingAvailability='" + pricingAvailability + '\'' +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
