package com.lzc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;





/**
 * Hello world!
 * 
 */
@EnableEurekaServer
@SpringBootApplication
public class RegCenterServiceTest {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(Application.class).web(true).run(args);
		new SpringApplicationBuilder(RegCenterServiceTest.class).web(true).run(args);
		System.out.println("注册中心启动完成");
	}
}
