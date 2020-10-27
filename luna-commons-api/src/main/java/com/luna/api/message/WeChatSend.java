package com.luna.api.message;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;
import com.luna.common.http.HttpUtils;
import com.luna.common.utils.text.StringUtils;
import org.apache.http.HttpResponse;

public class WeChatSend {

    /**
     * 微信设备推送
     * @param title
     * @param content
     * @return
     */
    public static boolean sendMessage(String title, String content) {
        HttpResponse httpResponse = HttpUtils.doGet(WeChatMessageConstant.HOST, "/" + WeChatMessageConstant.SCKEY, null, ImmutableMap.of("text", title, "desp", content));
        JSONObject response = HttpUtils.getResponse(httpResponse);
        return StringUtils.equals("success",response.getString("errmsg"));
    }

    public static void main(String[] args) {
        System.out.println(sendMessage("luna", "test"));
    }

}
