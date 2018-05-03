package org.springboot.dubbo;

import org.springboot.dubbo.service.HelloConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DubboConsumerLauncher.class, args);
		HelloConsumer consumer = run.getBean(HelloConsumer.class);
		consumer.sayHello("ys");
	}
}
