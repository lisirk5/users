package com.ssm.springboot08;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class TopicCustomer {
    /**
     * 创建2个消费者
     * @param text
     */

//监听
    @JmsListener(destination = "Topl")
    public void subscriber2(TextMessage text) {
        try {
            System.out.println("消费者消费+"+text.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    @JmsListener(destination = "save")
    public void subscriber(TextMessage text) {
        try {
            System.out.println("消费者1111111111111111111111消费+"+text.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    @JmsListener(destination = "save")
    public void subscriber1(TextMessage text) {
        try {
            System.out.println("消费者2222222222222222222222消费+"+text.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
