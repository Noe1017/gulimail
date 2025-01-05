package com.atguigu.gulimall.product;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  1、整合MyBatis-Plus
 *      1）、导入依赖
 *              <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2）、
 *      1、配置数据源；
 *      2、配置MyBatis-plus
 **/
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication{
    public static void main(String[] args){
        SpringApplication.run(GulimallProductApplication.class , args);
    }
}