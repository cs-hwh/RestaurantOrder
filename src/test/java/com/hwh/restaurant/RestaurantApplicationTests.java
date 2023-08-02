package com.hwh.restaurant;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class RestaurantApplicationTests {

    @Test
    void contextLoads() {
        String[] arr={"da","231"};
        System.out.println(Arrays.toString(arr));
    }

}
