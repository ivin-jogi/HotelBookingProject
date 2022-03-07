package com.ibs.litmusproject.hotelbooking.service;

import com.ibs.litmusproject.hotelbooking.proplistpojos.PropertyListPojo;
import com.ibs.litmusproject.hotelbooking.proplistpojos.Result;
import com.ibs.litmusproject.hotelbooking.searchlistuipojo.Address;
import com.ibs.litmusproject.hotelbooking.searchlistuipojo.Hotel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchListService {

    /* private String getApiUrl(String destId,String checkIn,String checkOut){
            return ""+"destinationId="+destId+"&pageNumber=1&pageSize=10&checkIn="+checkIn+"&checkOut="+checkOut+"&adults1=1&sortOrder=PRICE&locale=en_US&currency=USD";
        }*/
    public List<Hotel> getPropertyListApi(String destId,String checkIn,String checkOut) {

       // String rapidUrl = "https://hotels4.p.rapidapi.com/properties/list?destinationId=1506246&pageNumber=1&pageSize=25&checkIn=2020-01-08&checkOut=2020-01-15&adults1=1&sortOrder=PRICE&locale=en_US&currency=USD";
        String apiUrl = "https://hotels4.p.rapidapi.com/properties/list";
        apiUrl = apiUrl + "?" + "destinationId="+destId+"&pageNumber=1&pageSize=10&checkIn="+checkIn+"&checkOut="+checkOut ;
        RestTemplate restTemplate = new RestTemplate();

        List<Hotel> searchList=new ArrayList<>();
        try {
            URI uri;
            uri = new URI(apiUrl);
            HttpHeaders headers = new HttpHeaders();
            headers.set("x-rapidapi-key", "05fb929379msh412cb255423d877p14d1c1jsn4e552df10dd7");
            headers.set("x-rapidapi-host", "hotels4.p.rapidapi.com");
            headers.set("content-type", "application/json");
            headers.setContentType(MediaType.APPLICATION_JSON);


            HttpEntity<String> request = new HttpEntity<String>(headers);
            ResponseEntity<PropertyListPojo> pojoEntity = restTemplate.exchange(uri, HttpMethod.GET, request,
                    PropertyListPojo.class);
            PropertyListPojo pojoData = pojoEntity.getBody();
            // System.out.println(""+pojoData.getResult());
            System.out.println("" + pojoData.getData().getBody().getHeader());
            // System.out.println(""+pojoData.getData().getBody().getSearchResults().getResults().get(0).getStarRating());


            searchList=extractRapidApiHotelList(pojoData);
            searchList.stream().forEach(System.out::println);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
     return searchList;
    }

    public List<Hotel> extractRapidApiHotelList(PropertyListPojo pojo){
        List<Hotel> extractList= new ArrayList<>();
        List<Result> lstResult= pojo.getData().getBody().getSearchResults().getResults();
        lstResult.stream().forEach(r -> {
            Hotel hotel=new Hotel();
            hotel.setId(r.getId().longValue());
            hotel.setName(r.getName());
            hotel.setStarRating(r.getStarRating().floatValue());

            Address address=new Address();
            address.setStreetAddress(r.getAddress().getStreetAddress());
            address.setLocality(r.getAddress().getLocality());
            address.setPostalCode(r.getAddress().getPostalCode());
            address.setCountryName(r.getAddress().getCountryName());
            List<Address> lstAddress=new ArrayList<>();
            lstAddress.add(address);
            hotel.setAddress(lstAddress);
            extractList.add(hotel);
        });

        return extractList;
    }


 /*   public static void main(String[] args) {
        SearchListService testCode=new SearchListService();
        testCode.getPropertyListApi("1506246","2020-01-08","2020-01-15");
        // testPropertyDetailApi();
        //testLocationSearchApi();
    }*/
}
