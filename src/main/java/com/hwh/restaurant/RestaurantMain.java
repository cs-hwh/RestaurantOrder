package com.hwh.restaurant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hwh
 * @description:
 * @create 2023-07-29 20:55
 */
@SpringBootApplication
@MapperScan("com.hwh.restaurant.mapper")
public class RestaurantMain {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantMain.class,args);
    }
}
