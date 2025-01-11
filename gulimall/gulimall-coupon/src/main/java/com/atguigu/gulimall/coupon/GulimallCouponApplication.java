package com.atguigu.gulimall.coupon;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GulimallCouponApplication{
    public static void main(String [] args){
        try{
            SpringApplication.run(GulimallCouponApplication.class , args);
        } catch (UnsatisfiedDependencyException e){
            e.printStackTrace();
        }
    }
}