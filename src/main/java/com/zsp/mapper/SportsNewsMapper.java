package com.zsp.mapper;

import com.zsp.bean.SportNewsEntity;
import com.zsp.bean.SportVideoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/30 0030 16:57
 * email:zsp872126510@gmail.com
 */
@Mapper
public interface SportsNewsMapper {
    List<SportNewsEntity> getCBANewsList();
    List<SportNewsEntity> getChinaSoccerNewsList();
    List<SportNewsEntity> getLatestNewsList();
    List<SportNewsEntity> getNBANewsList();
    List<SportNewsEntity> getWorldSoccerNewsList();
    List<SportNewsEntity> getOtherNewsList();
    List<SportNewsEntity> getHuPuSoccerNewsList();
    List<SportVideoEntity> getVideoList();

}
