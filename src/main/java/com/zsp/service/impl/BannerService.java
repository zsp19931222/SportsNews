package com.zsp.service.impl;

import com.zsp.bean.BannerEntity;
import com.zsp.mapper.BannerMapper;
import com.zsp.service.IBannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/24 0024 14:32
 * email:zsp872126510@gmail.com
 */
@Service
public class BannerService implements IBannerService {
    @Resource
    BannerMapper bannerMapper;

    @Override
    public List<BannerEntity> getBannerList() {
        return bannerMapper.getBannerList();
    }


}
