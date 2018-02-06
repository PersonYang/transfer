package com.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/dubbo-server.xml")
public class TransferTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferTradeApplication.class, args);
	}
}
