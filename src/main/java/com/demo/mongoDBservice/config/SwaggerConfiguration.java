package com.demo.mongoDBservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration
{

    @Bean
    public Docket quoteApi ()
    {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors
                .basePackage("com.demo.mongoDBservice.controller"))
            .paths(PathSelectors.regex("/db.*"))
            .build()
            .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo("Quotes API", "Quotes API will help in adding the shares for users", "1.0", "http://www.blah.com", new Contact("Sherlock Holmes", "https://www.nethflix.com", "sherlock.holmes@gmail.com"), "License Version 2.0", "http://www.licenseVerison.com");
    }
}
