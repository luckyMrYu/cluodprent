package com.example.hanggeconsumer.config;

import com.example.hanggeconsumer.Interceptor.ConsumerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//只要类上加@Configuration，就说明此类为一个配置类，就相当于一个xml配置文件
@Configuration
public class ConsumerInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //定义要拦截的路径
        String[] addPathPatterns = {
                "/user/**"
        };

        //排除不需要拦截的路径
        String[] excludePathPatterns = {
                "/user/login",
                "/user/loginerror",
                "/user/loginno"
        };

        registry.addInterceptor(new ConsumerInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }
}
