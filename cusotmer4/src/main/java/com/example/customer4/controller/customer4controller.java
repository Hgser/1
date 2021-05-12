package com.example.customer4.controller;

import com.example.customer4.receiver;
//import com.example.customer4.receiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class customer4controller {
    String showme=null;
    @Autowired
    private receiver receivertest;
    @RequestMapping("/receive")
    public String showreceive(){
        System.out.println("receive start");
        try{
            showme =receivertest.process("ceshixiaoxi");
        }catch(Exception e){
            return "something error";
        }
        return showme;
    }
    @RequestMapping("/hi")
    public String test() {
        System.out.println("controller被调用");
        System.out.println("开始调用service");
        return "connect customer2 ok";
    }
}
