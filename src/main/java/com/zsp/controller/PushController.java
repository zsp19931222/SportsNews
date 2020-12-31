package com.zsp.controller;

import com.zsp.error.ResultBody;
import com.zsp.push.Push;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * description:
 * author:created by zsp on 2020/12/29 0029 14:09
 * email:zsp872126510@gmail.com
 */
@RestController
@RequestMapping(value = "/push")
public class PushController {
    @Resource
    Push push;

    @GetMapping(value = "/pushMessage/{title}/{message}")
    @ResponseBody
    public ResultBody pushMessage(@PathVariable(value = "title") String title, @PathVariable(value = "message") String message) {
        return push.send(title, message);
    }
}
