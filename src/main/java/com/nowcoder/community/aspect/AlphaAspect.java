package com.nowcoder.community.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * todo aop思想,就是设切点，然后对切点统一操作，强在不用每个类每个方法都写相同的操作。
 *
 * */
//@Component
//@Aspect
public class AlphaAspect {

    /// 统一设切点(例如在某类，某类的某方法)，这里是所有service都被设切点了
    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut() {

    }
    /// 以下是设 在切点前操作 还是切点后操作 还是有返回值后操作 还是报异常后操作 还是切点前后都操作
    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("pointcut()")
    public void afterRetuning() {
        System.out.println("afterRetuning");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object obj = joinPoint.proceed();
        System.out.println("around after");
        return obj;
    }

}
