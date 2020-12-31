package com.zsp.service.impl;

import com.zsp.bean.RaidersEntity;
import com.zsp.mapper.RaiderMapper;
import com.zsp.service.IRaiderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/23 0023 15:33
 * email:zsp872126510@gmail.com
 */
@Service
public class RaiderService implements IRaiderService {
    @Resource
    RaiderMapper raiderMapper;

    @Override
    public List<RaidersEntity> getRaiderList() {
        return raiderMapper.getRaiderList();
    }
}
