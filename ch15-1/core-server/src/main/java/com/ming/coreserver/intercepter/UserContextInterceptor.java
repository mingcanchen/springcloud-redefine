package com.ming.coreserver.intercepter;

import com.alibaba.fastjson.JSON;
import com.ming.coreserver.util.UserPermissionUtil;
import com.ming.coreserver.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chenmingcan
 */
public class UserContextInterceptor extends HandlerInterceptorAdapter {

    private static final Logger log = LoggerFactory.getLogger(UserContextInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        User user = getUser(request);
        UserPermissionUtil.permission(user);
        if (!UserPermissionUtil.verify(user, request)) {
            response.setHeader("Content-Type", "application/json");
            String jsonStr = JSON.toJSONString("no permission access service, please check");
            response.getWriter().write(jsonStr);
            response.getWriter().flush();
            response.getWriter().close();
            throw new PermissionException("no permission access service, please check");
        }
        UserContextHolder.set(user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2, ModelAndView arg3)
            throws Exception {
        // DOING NOTHING
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object arg2, Exception arg3)
            throws Exception {
        UserContextHolder.shutdown();
    }

    private User getUser(HttpServletRequest request) {
        String userId = request.getHeader("x-user-id");
        String username = request.getHeader("x-user-name");
        User user = new User();
        user.setUserId(userId);
        user.setUserName(username);
        return user;
    }

    static class PermissionException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public PermissionException(String msg) {
            super(msg);
        }
    }
}
