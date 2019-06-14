package com.zcit.agent.controller;

import com.alibaba.fastjson.JSONObject;
import com.zcit.agent.model.CbaAccount;
import com.zcit.agent.model.CbaCar;
import com.zcit.agent.service.CbaCarService;
import com.zcit.utils.RequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ZWT
 * @date 2019/5/8
 */
@RestController
public class CbaCarController {

    @Autowired
    private CbaCarService cbaCarService =null;

    @RequestMapping(value = "/car/add", produces = {"application/json;charset=UTF-8"})
    public int addCbaCar(HttpServletRequest request){
        JSONObject jsonObject =  RequestUtils.getJson(request);
        CbaCar car = JSONObject.toJavaObject(jsonObject ,CbaCar.class);
        return cbaCarService.addCbaCar(car);
    }


}

