package com.dubbo.consumer;

import com.dubbo.api.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        //启动消费者项目
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer");
        System.out.println(userService.getUserInfo(1));
    }
}
