package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {
//todo 不写内容，这里采用元注解
// 打上这个标记的路径方法，必须登录才能访问
// 至于为什么会这样，是因为我 “ 用拦截器拦截带有这种注解的方法 ”,然后判断登没登录
// 拦截器为 LoginRequiredInterceptor

}
