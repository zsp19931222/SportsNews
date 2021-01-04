package com.zsp.service.impl;

import com.zsp.bean.SportNewsEntity;
import com.zsp.mapper.SportsNewsMapper;
import com.zsp.service.ISportsNewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/30 0030 16:52
 * email:zsp872126510@gmail.com
 */
@Service
public class SportsNewsService implements ISportsNewsService {
    @Resource
    SportsNewsMapper sportsNewsMapper;

    @Override
    public List<SportNewsEntity> getCBANewsList() {
        return sportsNewsMapper.getCBANewsList();
    }

    @Override
    public List<SportNewsEntity> getChinaSoccerNewsList() {
        return sportsNewsMapper.getChinaSoccerNewsList();
    }

    @Override
    public List<SportNewsEntity> getLatestNewsList() {
        return sportsNewsMapper.getLatestNewsList();
    }

    @Override
    public List<SportNewsEntity> getNBANewsList() {
        return sportsNewsMapper.getNBANewsList();
    }

    @Override
    public List<SportNewsEntity> getWorldSoccerNewsList() {
        return sportsNewsMapper.getWorldSoccerNewsList();
    }

    @Override
    public List<SportNewsEntity> getOtherNewsList() {
        return sportsNewsMapper.getOtherNewsList();
    }

    @Override
    public List<SportNewsEntity> getHuPuSoccerNewsList() {
        return sportsNewsMapper.getHuPuSoccerNewsList();
    }
}
