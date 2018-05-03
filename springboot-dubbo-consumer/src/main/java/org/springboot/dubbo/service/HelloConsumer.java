package org.springboot.dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class HelloConsumer {
	@Reference(version = "1.0.0")
	HelloService helloService;
	
	public void sayHello(String name) {
		System.out.println(helloService.sayHello(name));
	}
}
