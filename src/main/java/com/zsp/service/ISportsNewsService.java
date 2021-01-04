package com.zsp.service;

import com.zsp.bean.SportNewsEntity;

import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/30 0030 16:52
 * email:zsp872126510@gmail.com
 */
public interface ISportsNewsService {
    List<SportNewsEntity> getCBANewsList();
    List<SportNewsEntity> getChinaSoccerNewsList();
    List<SportNewsEntity> getLatestNewsList();
    List<SportNewsEntity> getNBANewsList();
    List<SportNewsEntity> getWorldSoccerNewsList();
    List<SportNewsEntity> getOtherNewsList();
    List<SportNewsEntity> getHuPuSoccerNewsList();

}
