package zjcloud.zjotaifc.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "serviceque")
public class Mqreceiver {


    @RabbitHandler
    public void process(String json) {
        System.out.println("Receiver  : 收到发来的消息" + json);
    }

}
