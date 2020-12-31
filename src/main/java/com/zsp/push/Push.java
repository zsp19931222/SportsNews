package com.zsp.push;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;
import com.zsp.error.ResultBody;
import com.zsp.util.Log;
import org.springframework.stereotype.Component;

import static cn.jpush.api.push.model.notification.PlatformNotification.ALERT;


/**
 * description:
 * author:created by zsp on 2020/12/29 0029 11:17
 * email:zsp872126510@gmail.com
 */
@Component
public class Push {


    JPushClient jpushClient = new JPushClient("b0e838dd26364ead8ad98402", "228a772f477c0357d92c64d1", null, ClientConfig.getInstance());
    // For push, all you need do is to build PushPayload object.

    public ResultBody send(String title, String message) {
        try {
            PushResult result = jpushClient.sendPush(PushPayload.newBuilder()
                    .setPlatform(Platform.all())
                    .setAudience(Audience.alias("45145"))
                    .setNotification(Notification.android(message, title, null))
                    .build());
            Log.info("Got result - " + result);
            return ResultBody.success(result);
        } catch (APIConnectionException e) {
            // Connection error, should retry later
            Log.error("Connection error, should retry later", e);
            return ResultBody.error("Connection error, should retry later");
        } catch (APIRequestException e) {
            // Should review the error, and fix the request
            Log.error("Should review the error, and fix the request", e);
            Log.info("HTTP Status: " + e.getStatus());
            Log.info("Error Code: " + e.getErrorCode());
            Log.info("Error Message: " + e.getErrorMessage());
            return ResultBody.error("Should review the error, and fix the request");
        }
    }

}
