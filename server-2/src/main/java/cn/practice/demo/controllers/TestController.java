package cn.practice.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.practice.demo.api.Server_1_api;

@RestController
public class TestController {
	
	@Autowired
	private Server_1_api server;
	
	
	@RequestMapping("/getRemote")
	public String getServer_1Msg() {
		return server.getMsg();
	}
	@RequestMapping("/getMsg")
	public String getMsg() {
		return "this is server_2";
	}
}
