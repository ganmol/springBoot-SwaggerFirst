package com.ag.swagger_SpringBoot.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ag.swagger_SpringBoot.model.Book;
import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*this class contains the swagger urls*/
@Configuration
@EnableSwagger2
public class BookConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("ag");
				//.apiInfo(apiInfo()).select().paths(regex("/book.*")).build();
				
	}



	private ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("Book Service")
					.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
					.license("dummy License").version("1.0").build();
		}
	

}
