package com.assign.hitesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket goalApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("Hitesh-Goal-API")
                .apiInfo(Inform()).select().paths(goalPaths()).build();
    }

    private Predicate<String> goalPaths() {
        return or(regex("/goals"), regex("/goals.*"));
    }
    private ApiInfo Inform() {
        return new ApiInfoBuilder().title("Goal APIs")
                .description("Rest Api for GOALS")
                .contact("hitesh.ahuja@gemnisolutions.in").build();
    }

}

