package com.shubham.apigateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class will contain the routing logic
 *
 * client -> (ms1) APIGateWay
 *
 * For creating the routing logic,
 * 1. add the dependency in pom.xml
 *
 * RouteLocator Interface --> This is used to define the routes
 */
@Configuration
public class ApiGateWayConfig {

    /**
     * @Bean annotation will take the object returned from this method and put it in spring container
     * @param builder
     * @return
     *
     * To use @Bean annotation :
     * 1. Use it before a method that returns the object whose bean has to be created
     * 2. The class should be annotated with @Configuration
     */
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes().route(r -> r.path("/ms1/v1/**")
                        .uri("lb://MICROSERVICE1"))

                .route(r -> r.path("/ms2/v1/**")
                        .uri("lb://MICROSERVICE2"))
                .build();
    }
}
