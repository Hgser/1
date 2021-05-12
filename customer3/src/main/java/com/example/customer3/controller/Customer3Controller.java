package com.example.customer3.controller;

import com.example.customer3.sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Customer3Controller {
    String sendreturn=null;
    @Autowired
    private com.example.customer3.sender sender;
    @Value("${server.port}")
    String port;
    @RequestMapping("/send")
    public String sendsomething(){
        System.out.println("send start");
        sendreturn = sender.send("这什么玩意");
        return sendreturn;
    }
    @RequestMapping("/port")
    public String test() {
        System.out.println("controller被调用");
        System.out.println("开始调用service");

        return "the port is" + port;
    }

}
