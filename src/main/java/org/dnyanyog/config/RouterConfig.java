package org.dnyanyog.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("directory_route", r -> r.path("/api/auth/v1/**").uri("http://localhost:8081"))
				.route("patient_route", r -> r.path("/patient/api/v1/**").uri("http://localhost:8082"))
				.route("case_route", r -> r.path("/case/api/v1/**").uri("http://localhost:8083"))
				.route("appointment_route",r -> r.path("/appointment/api/v1/**").uri("http://localhost:8084"))
				.build();
	}
}
