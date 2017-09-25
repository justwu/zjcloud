package zjcloud.zjotaifc.servicecall;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Zjotaservice {
    @Autowired
    RestTemplate restTemplate;

    Logger logger= LoggerFactory.getLogger(Zjotaservice.class);

   @HystrixCommand(fallbackMethod = "fallback")
    public String callZjsercice(String url,Object requestform){
//        return restTemplate
       ResponseEntity<String> responseEntity=restTemplate.postForEntity(url,requestform,String.class);
       return responseEntity.getBody();
    }

    public String fallback(String url,Object requestform){ //注意. 失败方法要跟command注解的方法参数完全一样.包括参数顺序
        logger.error("调用失败~! ");

//        ObjectNode objectNode= ObjectMapper.
        ObjectNode objectNode=new ObjectMapper().createObjectNode();
        objectNode.put("result","fail");
        return objectNode.toString();
    }


}
