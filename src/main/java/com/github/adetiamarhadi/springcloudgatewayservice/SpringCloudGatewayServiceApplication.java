package com.github.adetiamarhadi.springcloudgatewayservice;

import com.github.adetiamarhadi.springcloudgatewayservice.filters.AddRequestHeaderFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@Configuration
public class SpringCloudGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayServiceApplication.class, args);
	}

	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter() {
		return new AddRequestHeaderFilter();
	}

}
