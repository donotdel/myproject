package com.zcit.agent.model.mapper;

import com.zcit.agent.model.CbaCar;

public interface CbaCarMapper {
    int insert(CbaCar record);

    int insertSelective(CbaCar record);
}