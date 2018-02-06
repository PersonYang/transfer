package com.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/dubbo-provider.xml")
public class TransferBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferBillApplication.class, args);
	}
}
