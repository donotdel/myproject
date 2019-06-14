package com.zcit.agent.service.impl;

import com.zcit.agent.model.CbaAccount;
import com.zcit.agent.model.mapper.CbaAccountMapper;
import com.zcit.agent.service.CbaAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cbaAccountService")
public class CbaAccountServiceImpl implements CbaAccountService {

   Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private CbaAccountMapper mapper;

    @Override
    public int addAccount(CbaAccount account) {
        return mapper.insertSelective(account);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<CbaAccount> findAllAccount(int pageNo, int pageSize) {

        logger.trace("查询用户的方法");
        logger.info("查询用户方法信息");
       // PageHelper.startPage(pageNo, pageSize);
        return mapper.selectAllAccount();
    }
}
