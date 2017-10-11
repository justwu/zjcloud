package com.zj.mq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zj.pojo.otarequest.*;
import com.zj.utils.CalculateDate;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class MqSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
//        String msg=
        ObjectMapper mapper = new ObjectMapper();
        WxOrderForm orderForm = getOrderform();
        String jsonstr = "";
        try {
            mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            jsonstr = mapper.writeValueAsString(orderForm);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        rabbitTemplate.convertAndSend("serviceque", jsonstr);
        System.out.println("发送..");
    }

    private WxOrderForm getOrderform() {
        Date arrdate = new Date();
        WxOrderForm orderForm = new WxOrderForm();
        orderForm.setOtaorderid(new Random().nextInt(888888) + "");
        orderForm.setSceniccode("GBHOTEL");
        orderForm.setChannelcode("EW");
        orderForm.setPayment(BigDecimal.valueOf(100));
        orderForm.setRemark("备注信息");
//      orderForm.setMemo("testMemo");
        orderForm.setPaytype("WX");
        WxGuestInfo info = new WxGuestInfo();
        info.setGuestname("综合预订测试档案");
        info.setMobile("13307791111");
        info.setIdno("55555555555");
        info.setIdtype("SF");
        info.setProfileid("532532532");
        orderForm.setGuestinfo(info);

        List<WxRoom> rooms = new ArrayList<WxRoom>();
        WxRoom room = new WxRoom();
        room.setStartdate(arrdate);
        room.setEnddate(CalculateDate.reckonDay(room.getStartdate(), 5, 1));
        room.setHotelid("SZ");
        room.setRoomtype("SZ22");
        room.setNum(1);
        room.setAmount(BigDecimal.ONE);
        info = new WxGuestInfo();
        info.setGuestname("客房测试");
        info.setMobile("13307792222");
        info.setIdno("666666666");
        info.setIdtype("SF");
        info.setProfileid("321321321");
        room.setGuestinfo(info);
        rooms.add(room);

        List<WxPos> poss = new ArrayList<WxPos>();
        WxPos pos = new WxPos();
        pos.setPoscode("001");
        pos.setNum(1);
        pos.setAmount(BigDecimal.ONE);
        pos.setUsedate(arrdate);
        pos.setPeriod("1");
        info = new WxGuestInfo();
        info.setGuestname("餐饮档案");
        info.setMobile("13307793333");
        info.setIdno("77777777");
        info.setIdtype("SF");
        info.setProfileid("525253252");
        pos.setGuestinfo(info);
        poss.add(pos);

        List<WxTicket> tickets = new ArrayList<WxTicket>();
        WxTicket ticket = new WxTicket();
        ticket.setNum(2);
        ticket.setTicketcode("003");
        ticket.setAmount(BigDecimal.ONE);
        ticket.setUsedate(arrdate);
        info = new WxGuestInfo();
        info.setGuestname("门票档案");
        info.setMobile("13307794444");
        info.setIdno("888888888");
        info.setIdtype("SF");
        info.setProfileid("86858485");
        ticket.setGuestinfo(info);
        tickets.add(ticket);

        WxOrderList orderList = new WxOrderList();
        orderForm.setOrderlist(orderList);

        orderForm.getOrderlist().getRoom().addAll(rooms);
//      orderForm.getOrderlist().getPos().addAll(poss);
//      orderForm.getOrderlist().getTicket().addAll(tickets);
        return orderForm;
    }

}
