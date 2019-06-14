package com.zcit.agent.service;

import com.zcit.agent.model.CbaAccount;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CbaAccountService {

    int addAccount(CbaAccount account);

    List<CbaAccount> findAllAccount(int pageNo, int pageSize);

}
