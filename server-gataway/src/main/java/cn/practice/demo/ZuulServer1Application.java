package cn.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy	//使服务器成为一个Zuul服务器
public class ZuulServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServer1Application.class, args);
	}

}
