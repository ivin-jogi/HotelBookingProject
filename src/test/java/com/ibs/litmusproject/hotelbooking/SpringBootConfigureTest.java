package com.ibs.litmusproject.hotelbooking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class SpringBootConfigureTest {
    @Test
    void contextLoads() {
        // empty test that would fail if our Spring configuration does not load correctly
    }
    @Test
    void contextLoads(ApplicationContext context) {
        assertThat(context).isNotNull();
    }

    @Test
    void hasIndieAuthControllerConfigured(ApplicationContext context) {
        assertThat(context.getBean("accessTokenVerifier")).isNotNull();
    }
}
