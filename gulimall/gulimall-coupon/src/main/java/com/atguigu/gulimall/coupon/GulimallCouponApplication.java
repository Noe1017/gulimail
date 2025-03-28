package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static  void main(String [] args){
        SpringApplication.run(GulimallCouponApplication.class , args);
    }
}