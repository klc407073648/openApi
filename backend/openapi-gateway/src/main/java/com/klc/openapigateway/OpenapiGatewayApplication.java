package com.klc.openapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenapiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiGatewayApplication.class, args);
	}

	/*
	@SpringBootApplication
	public class DemogatewayApplication {
		@Bean
		public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
			return builder.routes()
					.route("baidu", r -> r.path("/baidu")
							.uri("http://www.baidu.com"))
					.route("stibel", r -> r.path("/stibel")
							.uri("http://stibel.icu"))
					.route("stibel_detail", r -> r.path("/stibel_detail")
							.uri("https://stibel.icu/md/c++/function/c++-function-Linux_Hook.html"))
					.build();
		}
	}
	 */

}
