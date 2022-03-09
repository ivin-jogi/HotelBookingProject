package com.ibs.litmusproject.hotelbooking.testSearchListService;

import com.ibs.litmusproject.hotelbooking.service.SearchDetailsService;
import com.ibs.litmusproject.hotelbooking.web.dto.SearchDetailDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SearchDetailServiceTest {

    @Autowired
    SearchDetailsService detailsService;

    @Test
    public void getHotelDetailsTest(){

       SearchDetailDto details=detailsService.getPropertyDetailApi("424023");
                  details.getPropertyDescription().get(0).getAddress();
                  details.getPdpheader();
                  details.getOverview().getTitle();
                  details.getPdpheader().getDestinationId();
        assertTrue(Integer.parseInt(details.getPdpheader().getDestinationId()) > 0);
        Assertions.assertNotNull(details.getOverview().getTitle());
        Assertions.assertNotNull(details.getPropertyDescription().get(0).getAddress());
    }
}
