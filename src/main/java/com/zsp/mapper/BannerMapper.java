package com.zsp.mapper;

import com.zsp.bean.BannerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/24 0024 14:29
 * email:zsp872126510@gmail.com
 */
@Mapper
public interface BannerMapper {
    @Select(value = "select * from banner")
    List<BannerEntity> getBannerList();
}
