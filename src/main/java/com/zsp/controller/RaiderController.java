package com.zsp.controller;

import com.github.pagehelper.PageHelper;
import com.zsp.bean.RaidersEntity;
import com.zsp.error.ResultBody;
import com.zsp.service.impl.RaiderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author:created by zsp on 2020/12/23 0023 15:34
 * email:zsp872126510@gmail.com
 */
@RestController
@RequestMapping(value = "/raider")
public class RaiderController {
    @Resource
    RaiderService raiderService;

    @GetMapping(value = "/getRaiderList/{pageSize}/{pageNum}")
    @ResponseBody
    public ResultBody getRaiderList(@PathVariable(value = "pageSize") int pageSize,@PathVariable(value = "pageNum") int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return ResultBody.success(raiderService.getRaiderList());
    }
}
