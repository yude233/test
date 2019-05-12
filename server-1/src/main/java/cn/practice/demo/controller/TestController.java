package cn.practice.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(
			value = "/getMessage",
			method = RequestMethod.GET,
			consumes = "application/json")
	public String getMsg() {
		return "hello, this is server_1";
	}
}
