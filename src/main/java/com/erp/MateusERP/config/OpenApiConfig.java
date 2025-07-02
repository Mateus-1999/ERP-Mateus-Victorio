package com.erp.MateusERP.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ERP Mateus Victorio")
                        .version("1.0")
                        .description("ERP Developed to study and to future project")
                        .termsOfService("http://example.com/terms/")
                        .contact(new io.swagger.v3.oas.models.info.Contact().name("Mateus Victorio").email("mateus19992008@hotmail.com")));
    }
}
