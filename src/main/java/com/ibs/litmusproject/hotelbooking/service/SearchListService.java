package com.ibs.litmusproject.hotelbooking.service;

import com.ibs.litmusproject.hotelbooking.proplistpojos.PropertyListPojo;
import com.ibs.litmusproject.hotelbooking.proplistpojos.Result;
import com.ibs.litmusproject.hotelbooking.searchlistuipojo.Address;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchResultDto;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchListService {

    @Value("${api.rapidapi.key}")
    private String apikey;//"05fb929379msh412cb255423d877p14d1c1jsn4e552df10dd7"

    public List<SearchResultDto> getPropertyListApi(String destId, String checkIn, String checkOut, String adult) {
        System.out.println("apikey="+apikey);
        // String rapidUrl = "https://hotels4.p.rapidapi.com/properties/list?destinationId=1506246&pageNumber=1&pageSize=25&checkIn=2020-01-08&checkOut=2020-01-15&adults1=1&sortOrder=PRICE&locale=en_US&currency=USD";
        String apiUrl = "https://hotels4.p.rapidapi.com/properties/list";

        apiUrl = apiUrl + "?" + "destinationId=" + destId + "&pageNumber=1&pageSize=10&checkIn=" + checkIn + "&checkOut=" + checkOut + "&adults1=" + adult;

        RestTemplate restTemplate = new RestTemplate();
        List<SearchResultDto> searchList = new ArrayList<>();
        try {
            URI uri;
            uri = new URI(apiUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-rapidapi-key", apikey);
            headers.set("x-rapidapi-host", "hotels4.p.rapidapi.com");
            headers.set("content-type", "application/json");
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<PropertyListPojo> pojoEntity = restTemplate
                    .exchange(uri, HttpMethod.GET, request,
                            PropertyListPojo.class);
            PropertyListPojo pojoData = pojoEntity.getBody();
            searchList = extractRapidApiHotelList(pojoData);
            searchList.stream().forEach(System.out::println);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return searchList;
    }

    public List<SearchResultDto> extractRapidApiHotelList(PropertyListPojo pojo) {
        List<SearchResultDto> extractList = new ArrayList<>();
        List<Result> lstResult = pojo.getData().getBody().getSearchResults().getResults();
        lstResult.stream().forEach(r -> {
            SearchResultDto searchResultDto = new SearchResultDto();
            searchResultDto.setId(String.valueOf(r.getId()));
            searchResultDto.setHotelName(r.getName());
            searchResultDto.setHotelRating(String.valueOf(r.getStarRating()));
            Address address = new Address();
            address.setStreetAddress(r.getAddress().getStreetAddress());
            address.setLocality(r.getAddress().getLocality());
            address.setPostalCode(r.getAddress().getPostalCode());
            address.setCountryName(r.getAddress().getCountryName());
            List<Address> lstAddress = new ArrayList<>();
            lstAddress.add(address);
            searchResultDto.setAddress(lstAddress);
            extractList.add(searchResultDto);
        });
        return extractList;
    }


}
