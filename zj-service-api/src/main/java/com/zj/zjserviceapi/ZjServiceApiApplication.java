package com.zj.zjserviceapi;

import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZjServiceApiApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZjServiceApiApplication.class, args);
        new SpringApplicationBuilder(ZjServiceApiApplication.class)
                .web(true)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

    }
}
