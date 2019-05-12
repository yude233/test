package cn.practice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//启用Feign客户端
public class Server2Application {

	public static void main(String[] args) {
		SpringApplication.run(Server2Application.class, args);
	}

}
