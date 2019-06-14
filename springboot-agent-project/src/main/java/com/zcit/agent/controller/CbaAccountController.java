package com.zcit.agent.controller;

import com.zcit.agent.model.CbaAccount;
import com.zcit.agent.service.CbaAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CbaAccountController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CbaAccountService cbaAccountService;

    @RequestMapping(value = "/hello", produces = {"application/json;charset=UTF-8"})
    public String hello() {
        logger.trace("hello! trace----");
        logger.info("hello! Info---");
        return "helloWorld";
    }

    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addAccount(CbaAccount account){
        return cbaAccountService.addAccount(account);
    }

    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(){

        return cbaAccountService.findAllAccount(1,10);
    }

}
