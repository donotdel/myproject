package com.zcit.agent.model.mapper;

import com.zcit.agent.model.CbaAccount;
import com.zcit.agent.model.CbaAccountWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CbaAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CbaAccount record);

    int insertSelective(CbaAccount record);

    CbaAccountWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CbaAccountWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CbaAccountWithBLOBs record);

    int updateByPrimaryKey(CbaAccount record);

    // select All
    List<CbaAccount> selectAllAccount();
}