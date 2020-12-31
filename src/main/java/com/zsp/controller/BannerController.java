package com.zsp.controller;

import com.zsp.error.ResultBody;
import com.zsp.service.impl.BannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description:
 * author:created by zsp on 2020/12/24 0024 14:33
 * email:zsp872126510@gmail.com
 */
@RestController
@RequestMapping(value = "/banner")
public class BannerController {
    @Resource
    BannerService bannerService;

    @GetMapping(value = "/getBannerList")
    @ResponseBody
    public ResultBody getBannerList(){
        return ResultBody.success(bannerService.getBannerList());
    }
}
