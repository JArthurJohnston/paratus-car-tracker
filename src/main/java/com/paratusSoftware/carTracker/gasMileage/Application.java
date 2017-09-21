package com.paratusSoftware.carTracker.gasMileage;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class Application {
    
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket swaggerDocumentation(){
        return new Docket(DocumentationType.SWAGGER_12)
                .apiInfo(basicApiInformation())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");
    }

    private Predicate<String> ignoreErrorController(){
        return Predicates.not(PathSelectors.regex("/basic-error-controller.*"));
    }

    //for some reason this was breaking swagger
    public ApiInfo basicApiInformation(){
        return new ApiInfo(
                "Paratus Car Tracker",
                "a logger an aggregator for my car's data",
                "0.0.1",
                "https://google.com",
                "N/A",
                "N/A",
                "https://google.com"
        );
    }
}
