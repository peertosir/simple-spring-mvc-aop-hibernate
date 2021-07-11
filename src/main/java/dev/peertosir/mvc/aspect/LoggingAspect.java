package dev.peertosir.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Around("execution(* dev.peertosir.mvc.dao.*.*(..))")
    public Object aroundAllRepoMethodAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Method " + methodName + "starts...");
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("Method " + methodName + "ends job...");
        return targetMethodResult;
    }
}
