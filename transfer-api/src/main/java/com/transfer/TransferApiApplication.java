package com.transfer;

import com.transfer.config.ZipkinProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/dubbo-consumer.xml")
@EnableConfigurationProperties(ZipkinProperties.class)
public class TransferApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferApiApplication.class, args);
	}
}
