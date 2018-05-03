package org.springboot.dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0",interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "Hello, " + name + " (from Spring Boot)";
	}

}
