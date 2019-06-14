package com.zcit.agent.controller;

import com.zcit.agent.model.CbaAccount;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedInputStream;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/ok")
    public String hello(Map<String,Object> map){
        BufferedInputStream bis = new BufferedInputStream(System.in);
        map.put("msg","zhangweitao");
        CbaAccount cba = new CbaAccount();
        Class cls = cba.getClass();
        Class cls2 =  CbaAccount.class.getClass();
        return "ok";
    }

}
