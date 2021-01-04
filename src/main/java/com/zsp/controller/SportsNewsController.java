package com.zsp.controller;

import com.github.pagehelper.PageHelper;
import com.zsp.error.ResultBody;
import com.zsp.service.impl.SportsNewsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * description:
 * author:created by zsp on 2020/12/30 0030 17:00
 * email:zsp872126510@gmail.com
 */
@RestController
public class SportsNewsController {
    @Resource
    SportsNewsService sportsNewsService;

    @GetMapping(value = "/getNewsList/{state}/{pageSize}/{pageNum}")
    @ResponseBody
    public ResultBody getNewsList(@PathVariable(value = "state") int state, @PathVariable(value = "pageSize") int pageSize, @PathVariable(value = "pageNum") int pageNum) {
        Object resultBody;
        PageHelper.startPage(pageNum, pageSize);
        switch (state) {
            case 0:
                resultBody = sportsNewsService.getWorldSoccerNewsList();
                break;
            case 1:
                resultBody = sportsNewsService.getChinaSoccerNewsList();
                break;
            case 2:
                resultBody = sportsNewsService.getNBANewsList();
                break;
            case 3:
                resultBody = sportsNewsService.getCBANewsList();
                break;
            case 4:
                resultBody = sportsNewsService.getOtherNewsList();
                break;
            case 5:
                resultBody = sportsNewsService.getLatestNewsList();
                break;
            case 6:
                resultBody = sportsNewsService.getHuPuSoccerNewsList();
                break;
            default:
                return ResultBody.error("无该栏目");
        }
        return ResultBody.success(resultBody);
    }
}
