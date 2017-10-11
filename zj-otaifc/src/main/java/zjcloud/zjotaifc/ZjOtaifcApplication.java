package zjcloud.zjotaifc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication  //springcloudapplication 自动包含eureka客户端,断路器注解
public class ZjOtaifcApplication {

	private Logger logger= LoggerFactory.getLogger(ZjOtaifcApplication.class);

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		logger.info("调用生成一个resttemplate对象");
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZjOtaifcApplication.class, args);
	}
}
