package com.framework.web.utils;


import com.framework.core.redis.WxJedisCommands;
import com.framework.core.redis.WxRedisClient;
import com.framework.core.security.User;
import com.framework.core.util.CookieUtils;
import com.framework.core.util.JsonUtils;

import javax.servlet.http.HttpServletRequest;

public class UserUtils {

    /**
     * redis中获取登录用户
     * @param request
     * @return
     */
    public static User getUser(HttpServletRequest request) {
        WxJedisCommands commonJedis = WxRedisClient.getCommonJedis();
        User user = JsonUtils.fromJson(commonJedis.get(CookieUtils.getLoginToken(request)), User.class);
        return user;
    }
}
