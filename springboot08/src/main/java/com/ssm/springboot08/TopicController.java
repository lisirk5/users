package com.ssm.springboot08;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @RequestMapping("send")
    public void send(){
        jmsMessagingTemplate.convertAndSend("Topl","select");
    }
    @RequestMapping("/save")
    public void publish(){
        ActiveMQTopic activeMQTopic=new ActiveMQTopic("save");
   jmsMessagingTemplate.convertAndSend(activeMQTopic,"selectsave");
    }

}
