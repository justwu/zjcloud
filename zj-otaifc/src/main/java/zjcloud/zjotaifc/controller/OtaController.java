package zjcloud.zjotaifc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zjcloud.zjotaifc.servicecall.Zjotaservice;

@RestController
@RequestMapping(value = "/ota",method = RequestMethod.GET)
public class OtaController {
   @Autowired
    RestTemplate restTemplate;


   @Autowired
    Zjotaservice zjotaservice;

   @RequestMapping(value = "sections")
   public String querySection(){
       String url="http://zjservice/ota/showreg";
//       ResponseEntity<String> responseEntity =restTemplate.postForEntity(url,null,String.class);
//       return responseEntity.getBody();
        return zjotaservice.callZjsercice(url,null);
   }



}
