package com.zsp.mapper;

import com.zsp.bean.RaidersEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/23 0023 15:13
 * email:zsp872126510@gmail.com
 */
@Mapper
public interface RaiderMapper {
    List<RaidersEntity> getRaiderList();
}
