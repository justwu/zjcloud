package zjcloud.zjotaifc.servicecall;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("zjservice")
public interface OtaService {


    @RequestMapping("/ota/av")
    String querysection();

    @RequestMapping("/ota/av")
    String queryroomtype();

    @RequestMapping(value = "/ota/showreg", method = RequestMethod.POST)
    String showreg();


}
