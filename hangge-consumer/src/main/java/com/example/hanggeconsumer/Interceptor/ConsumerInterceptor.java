package com.example.hanggeconsumer.Interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//把他作为一个容器交给spring去管理
@Component
public class ConsumerInterceptor implements HandlerInterceptor {

    //处理请求之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //先检查用户是否登录
        Object user = request.getAttribute("user");
        if(null == user){
            response.sendRedirect("/user/loginno");
            return false;
        }
        return true;
    }

    //处理请求之后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    //相应之后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
