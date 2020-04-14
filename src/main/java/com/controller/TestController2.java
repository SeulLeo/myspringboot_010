package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	@RequestMapping("/demo2")
	public String sayHello() {
		return "hello";
	}
}
