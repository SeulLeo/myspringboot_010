package com.springboot_001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
	@RequestMapping("/demo1")
	public String sayHello() {
		return "hello";
	}
}
