package com.dong.ch10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    public LogAspect() {
        System.out.println("LogAspect construct ............");
    }

    @Pointcut("execution(public void com.dong.ch10.aop.Bread.roast(int))")
    public void pointCut(){}

    @Before("pointCut()")
    public void doBefore() {
        System.out.println("before roast...");
    }

    @After("pointCut()")
    public void doAfter() {
        System.out.println("after roast...");
    }

    @AfterReturning("pointCut()")
    public void doReturn() {
        System.out.println("return roast...");
    }

    @AfterThrowing("pointCut()")
    public void doThrowing() {
        System.out.println("exception roast...");
    }

    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around roast...");
        Object proceed = joinPoint.proceed();
        System.out.println("after around roast...");
        return proceed;
    }
}
