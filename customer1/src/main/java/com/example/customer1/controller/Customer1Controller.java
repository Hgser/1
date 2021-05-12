package com.example.customer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.customer1.sender;
@Controller
@ResponseBody
public class Customer1Controller {
    String sendreturn=null;
    @Autowired
    private sender sender;
    @Value("${server.port}")
    String port;
    @RequestMapping("/send")
    public String sendsomething(){
        System.out.println("send start");
        sendreturn = sender.send("这什么玩意");//这个东西可以被替换成很多东西啊。
        return sendreturn;
    }
    @RequestMapping("/port")
    public String test() {
        System.out.println("controller被调用");
        System.out.println("开始调用service");

        return "the port is" + port;
    }

}
