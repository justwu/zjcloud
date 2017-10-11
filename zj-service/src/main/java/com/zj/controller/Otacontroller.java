package com.zj.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zj.exception.DefinedException;
import com.zj.mq.MqSender;
import com.zj.pojo.otarequest.WxRequestForm;
import com.zj.service.api.OtaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ota", method = RequestMethod.POST)
public class Otacontroller {

    private Logger logger = LoggerFactory.getLogger(Otacontroller.class);

    private Logger justloger = LoggerFactory.getLogger("just");

    @Autowired
    @Qualifier("OtaServiceImpl")
    OtaService otaService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private MqSender mqSender;

    @RequestMapping("/sections")
    public ArrayNode wxQueryAvailProduct(@RequestBody WxRequestForm requestForm) throws DefinedException {
        ArrayNode result = otaService.wxQuerySections(requestForm);
        return result;
    }

    @RequestMapping("/roomtypes")
    public ObjectNode wxQueryRoomtypes(@RequestBody WxRequestForm requestForm) throws DefinedException {
        ObjectNode result = otaService.wxQueryRoomtypes(requestForm);
        if (justloger != null) {
            justloger.debug("hello~ just coming ");
        }
        otaService.testError();
        logger.info("没事没事");
        return result;
    }

    @RequestMapping("/showreg")
    public ObjectNode wxShowReg()throws  Exception{
      /*  int sleeptime=new Random().nextInt(2500);
        logger.info("本次睡眠时间"+sleeptime+"ms");
        Thread.currentThread().sleep(sleeptime);*/

        ObjectNode node= new ObjectMapper().createObjectNode();
        ArrayNode arrayNode=new ObjectMapper().createArrayNode();
        for (String s : discoveryClient.getServices()) {
            arrayNode.add(s);
        }
        node.put("name","999");
        node.set("rows",arrayNode);

        mqSender.send();

        return node;
    }


}
