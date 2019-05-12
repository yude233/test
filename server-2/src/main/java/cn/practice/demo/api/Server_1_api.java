package cn.practice.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("server-1")//注解标识服务，即远程服务名：spring.application.name
public interface Server_1_api {
	
	@RequestMapping(
			value = "/getMessage",
			method = RequestMethod.GET,
			consumes = "application/json")
	public String getMsg();
}
