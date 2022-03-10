package com.ibs.litmusproject.hotelbooking.service;

import com.ibs.litmusproject.hotelbooking.propdetailpojos.OverviewSection;
import com.ibs.litmusproject.hotelbooking.propdetailpojos.PropertyDetailsPojo;
import com.ibs.litmusproject.hotelbooking.propdetailpojos.Section;
import com.ibs.litmusproject.hotelbooking.uihoteldetailpojo.*;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchDetailsService {

    @Value("${api.rapidapi.key}")
    private String apikey;//"05fb929379msh412cb255423d877p14d1c1jsn4e552df10dd7"

    public SearchDetailsService() {
    }

    private OverViewSectionDto convertSectionToDto(OverviewSection os) {
        OverViewSectionDto viewsection = new OverViewSectionDto();
        viewsection.setTitle(os.getTitle());
        viewsection.setType(os.getType());
        viewsection.setContent(os.getContent());
        return viewsection;
    }

    public SearchDetailDto getPropertyDetailApi(String id) {
        System.out.println("apikey=" + apikey);
        String rapidUrl = "https://hotels4.p.rapidapi.com/properties/get-details?id=" + id;
        RestTemplate restTemplate = new RestTemplate();
        SearchDetailDto searchDetailDto = new SearchDetailDto();
        searchDetailDto.setId(id);
        try {
            URI uri;
            uri = new URI(rapidUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-rapidapi-key", apikey);
            headers.set("x-rapidapi-host", "hotels4.p.rapidapi.com");
            headers.set("content-type", "application/json");
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<PropertyDetailsPojo> pojoEntity = restTemplate
                    .exchange(uri, HttpMethod.GET, request,
                            PropertyDetailsPojo.class);
            PropertyDetailsPojo pojoData = pojoEntity.getBody();

//Extract each detail and add to detail object

            PdpHeaderdto headerdto = new PdpHeaderdto();
            HotelLocationDto locationDto = new HotelLocationDto();
            locationDto.setLocationName(pojoData.getData().getBody().getPdpHeader().getHotelLocation().getLocationName());
            headerdto.setHotelLocationDto(locationDto);
            headerdto.setDestinationId(pojoData.getData().getBody().getPdpHeader().getDestinationId());
            searchDetailDto.setPdpheader(headerdto);
            /*----------------------------------------------------------------------------------------------*/
            List<OverviewSection> section = pojoData.getData().getBody().getOverview()
                    .getOverviewSections();

            List<OverViewSectionDto> vlst = section.stream().map(this::convertSectionToDto)
                    .collect(Collectors.toList());

            OverviewDto overview = new OverviewDto();
            overview.setOverviewSections(vlst);

            searchDetailDto.setOverview(overview);
            /*----------------------------------------------------------------------------------------------*/
            PropertyDescriptionDto property = new PropertyDescriptionDto();
            property.setName(pojoData.getData().getBody().getPropertyDescription().getName());
            property.setAddress(
                    pojoData.getData().getBody().getPropertyDescription().getAddress().getFullAddress());
            property.setStarRatingTitle(
                    pojoData.getData().getBody().getPropertyDescription().getStarRatingTitle());
            MapWidgetDto map = new MapWidgetDto();
            map.setStaticMapurl(
                    pojoData.getData().getBody().getPropertyDescription().getMapWidget().getStaticMapUrl());
            property.setMapWidget(map);
            try {
                FeaturedPriceDto fprice = new FeaturedPriceDto();
                CurrentPriceDto cprice = new CurrentPriceDto();
                cprice.setFormatted(
                        pojoData.getData().getBody().getPropertyDescription().getFeaturedPrice().getCurrentPrice()
                                .getFormatted());
                fprice.setCurrentPrice(cprice);
                fprice.setPricingAvailability(
                        pojoData.getData().getBody().getPropertyDescription().getFeaturedPrice()
                                .getPricingAvailability());
                property.setFeaturedPrice(fprice);
            } catch (Exception e) {
                System.out.println("Price is not Provided");
            }
            property.setRoomTypeNames(
                    pojoData.getData().getBody().getPropertyDescription().getRoomTypeNames());
            List<PropertyDescriptionDto> lstproperty = new ArrayList<>();
            lstproperty.add(property);
            searchDetailDto.setPropertyDescription(lstproperty);
            /*----------------------------------------------------------------------------------------------*/
            AtAGlanceDto atAGlance = new AtAGlanceDto();
            KeyFactsDto keyFacts = new KeyFactsDto();
            keyFacts
                    .setHotelSize(pojoData.getData().getBody().getAtAGlance().getKeyFacts().getHotelSize());
            keyFacts.setHotelSize(
                    pojoData.getData().getBody().getAtAGlance().getKeyFacts().getArrivingLeaving());
            keyFacts.setHotelSize(
                    pojoData.getData().getBody().getAtAGlance().getKeyFacts().getRequiredAtCheckIn());
            atAGlance.setKeyFacts(keyFacts);
            TravellingOrInternetDto travel = new TravellingOrInternetDto();
            TravellingDto travelling = new TravellingDto();
            travelling.setPets(
                    pojoData.getData().getBody().getAtAGlance().getTravellingOrInternet().getTravelling()
                            .getPets());
            List<TravellingDto> lstTravel = new ArrayList<>();
            lstTravel.add(travelling);
            travel.setTravelling(lstTravel);
            travel.setInternet(
                    pojoData.getData().getBody().getAtAGlance().getTravellingOrInternet().getInternet());
            List<TravellingOrInternetDto> lstTrvelOrInternet = new ArrayList<>();
            lstTrvelOrInternet.add(travel);
            atAGlance.setTravellingOrInternet(lstTrvelOrInternet);
            List<AtAGlanceDto> lstGlance = new ArrayList<>();
            lstGlance.add(atAGlance);
            searchDetailDto.setAtAGlance(lstGlance);
            /*----------------------------------------------------------------------------------------------*/
            /*----------DOUBT----------*/
           /* List<Amenities> lstAmenities = new ArrayList<>();
            List<Amenity> lstAmenity = pojo.getData().getBody().getAmenities();
            lstAmenity.stream().forEach(r -> {
                Amenities am = new Amenities();
                am.setListItems(r.getListItems());
                ListItems lst = new ListItems();
                lst.setHeading(r.getHeading());
                lst.setListItems(r.getListItems());
                lstAmenities.add(am);

                HotelInDetail lstHotelAmenity = new HotelInDetail();
                lstHotelAmenity.setAmenities(lstAmenities);
                lstHotelDetail.add(lstHotelAmenity);

            });*/
            /*----------------------------------------------------------------------------------------------*/
            try {
                HygieneAndCleanlinessDto hygiene = new HygieneAndCleanlinessDto();
                hygiene.setTitle(pojoData.getData().getBody().getHygieneAndCleanliness().getTitle());

                HealthAndSafetyMeasuresDto measures = new HealthAndSafetyMeasuresDto();
                measures.setTitle(
                        pojoData.getData().getBody().getHygieneAndCleanliness().getHealthAndSafetyMeasures()
                                .getTitle());
                measures.setDescription(
                        pojoData.getData().getBody().getHygieneAndCleanliness().getHealthAndSafetyMeasures()
                                .getDescription());
                measures.setMeasures(
                        pojoData.getData().getBody().getHygieneAndCleanliness().getHealthAndSafetyMeasures()
                                .getMeasures());
                /*List<HealthAndSafetyMeasuresDto> lstMeasures = new ArrayList<>();
                lstMeasures.add(measures);*/
                hygiene.setHealthAndSafetyMeasures(measures);
                List<HygieneAndCleanlinessDto> hygieneAndCleanliness = new ArrayList<>();
                hygieneAndCleanliness.add(hygiene);
                //   HotelInDetail lstHotelHygiene = new HotelInDetail();
                searchDetailDto.setHygieneAndCleanliness(hygieneAndCleanliness);
                //   lstHotelDetail.add(lstHotel);
            } catch (NullPointerException e) {
                // e.printStackTrace();
                System.out.println("HotelBadge is not Provided");
            }
            /*----------------------------------------------------------------------------------------------*/
            List<Section> features = pojoData.getData().getBody().getSpecialFeatures().getSections();
            List<SpecialFeaturesDto> lstSpecial = new ArrayList<>();
            features.stream().forEach(r -> {
                SectionsDto sect = new SectionsDto();
                sect.setHeading(r.getHeading());
                sect.setFreeText(r.getFreeText());
                List<SectionsDto> lstSection = new ArrayList<>();
                lstSection.add(sect);
                SpecialFeaturesDto special = new SpecialFeaturesDto();
                special.setSections(lstSection);
                //   List<SpecialFeatures> lstSpecial=new ArrayList<>();
                lstSpecial.add(special);

                //   HotelInDetail lstHotelfeatures = new HotelInDetail();
            /*lstHotel.setSpecialFeatures(lstSpecial);
            lstHotelDetail.add(lstHotel);*/
            });
            searchDetailDto.setSpecialFeatures(lstSpecial);
            /*----------------------------------------------------------------------------------------------*/
            try {
                HotelBadgeDto hotelBadge = new HotelBadgeDto();
                hotelBadge.setType(pojoData.getData().getBody().getHotelBadge().getType());
                hotelBadge.setLabel(pojoData.getData().getBody().getHotelBadge().getLabel());
                hotelBadge.setTooltipTitle(pojoData.getData().getBody().getHotelBadge().getTooltipTitle());
                hotelBadge.setTooltipText(pojoData.getData().getBody().getHotelBadge().getTooltipText());

                //   HotelInDetail lstHotelBadge = new HotelInDetail();
                searchDetailDto.setHotelBadge(hotelBadge);
                //   lstHotelDetail.add(lstHotel);
            } catch (NullPointerException e) {
                // e.printStackTrace();
                System.out.println("HotelBadge is not Provided");
            }
            return searchDetailDto;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return searchDetailDto;
    }


}