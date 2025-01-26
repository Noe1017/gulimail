package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
	1、想要远程调用别的服务
	1）、引入open
* */
@EnableFeignClients(basePackages="com.atguigu.gulimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
