package com.zsp.controller;

import com.zsp.error.ResultBody;
import com.zsp.util.FastDFSUtil;
import com.zsp.util.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * description:
 * author:created by zsp on 2021/1/6 0006 10:39
 * email:zsp872126510@gmail.com
 */
@RestController
public class UploadFileController {
    @Resource
    FastDFSUtil fastDFSUtil;

    @ResponseBody
    @PostMapping(value = "/uploadFile")
    public ResultBody uploadFile(MultipartFile file) {
        try {
            String path = fastDFSUtil.uploadFile(file);
            return ResultBody.success(path);
        } catch (IOException e) {
            Log.info(e.toString());
            return ResultBody.error("上传失败");
        }
    }
}
