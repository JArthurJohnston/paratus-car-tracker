package com.paratusSoftware.carTracker;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.paratusSoftware.carTracker.gasMileage.Mileage;
import com.paratusSoftware.carTracker.gasMileage.MileageRepository;
import com.paratusSoftware.carTracker.location.Location;
import com.paratusSoftware.carTracker.location.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@SpringBootApplication
public class Application {

    @Autowired
    private static LocationRepository locationRepository;
    @Autowired
    private static MileageRepository mileageRepository;
    
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
//        initializeData();
    }

    private static void initializeData(){
        Location location1 = locationRepository.save(new Location(23234, 5643));
        Location location2 = locationRepository.save(new Location(6548,327));
        Location location3 = locationRepository.save(new Location(9840,6541));

        mileageRepository.save(new Mileage(321, location2));
        mileageRepository.save(new Mileage(242, location1));
        mileageRepository.save(new Mileage(987, location3));

    }



    @Bean
    public Docket swaggerDocumentation(){
        return new Docket(DocumentationType.SWAGGER_12)
                .apiInfo(basicApiInformation())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private Predicate<String> ignoreErrorController(){
        return Predicates.not(regex("/basic-error-controller.*"));
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
