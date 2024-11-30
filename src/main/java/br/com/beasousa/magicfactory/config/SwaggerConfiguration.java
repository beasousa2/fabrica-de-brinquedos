package br.com.beasousa.magicfactory.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Brinquedos")
                        .version("1.0.0")
                        .description("API para gerenciar fábricas de brinquedos")
                        .contact(new Contact()
                                .name("Beatriz Sousa")
                                .email("beasousa20@outlook.com")));
    }
}
