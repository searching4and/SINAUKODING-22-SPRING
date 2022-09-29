//package com.farhankoding.tokofarhan.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.sinaukoding.tokosinau"))
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo(){
//        return new ApiInfo(
//                "Sinau Koding 22",
//                "Api Documentation for Sinau Koding 22",
//                "1.0",
//                "",
//                contact(),
//                "",
//                "",
//                new ArrayList<>()
//        );
//    }
//
//    private Contact contact(){
//        return new Contact("Sinau Koding", "", "sinaukoding@mgs.or.id");
//    }
//}
