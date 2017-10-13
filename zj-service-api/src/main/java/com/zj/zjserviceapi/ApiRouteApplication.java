package com.zj.zjserviceapi;

import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ApiRouteApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZjServiceApiApplication.class, args);
        new SpringApplicationBuilder(ApiRouteApplication.class)
                .web(true)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

    }

   /* @Bean
    public Pmsfilter pmsfilter(){
        return new Pmsfilter();
    }*/

}
