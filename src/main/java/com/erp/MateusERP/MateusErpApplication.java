package com.erp.MateusERP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.erp.MateusERP.*",""})
public class MateusErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MateusErpApplication.class, args);
	}

}
