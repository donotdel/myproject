package com.zcit.agent.service.impl;

import com.zcit.agent.model.CbaAccount;
import com.zcit.agent.model.CbaAccountWithBLOBs;
import com.zcit.agent.model.CbaCar;
import com.zcit.agent.model.mapper.CbaAccountMapper;
import com.zcit.agent.model.mapper.CbaCarMapper;
import com.zcit.agent.service.CbaAccountService;
import com.zcit.agent.service.CbaCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CbaCarServiceImpl implements CbaCarService {

    @Resource
    CbaCarMapper mapper;

    @Autowired
    CbaAccountService cbaAccountService;

    @Override
    @Transactional
    public int addCbaCar(CbaCar car) {
        CbaAccount account = new CbaAccount(1,"zwt","18300000001","12345678","xxxx==",1);
        mapper.insert(car);
        test();
        cbaAccountService.addAccount(account);
        return 200;
    }

    private void test(){
        Integer.valueOf("");
    }
}
