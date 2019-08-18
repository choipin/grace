package com.grace.it.aop;

import com.grace.it.annotation.LoggerParam;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Optional;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@Aspect
@Slf4j
public class LoggerParamAspect {
    
    @Around("execution(* com.grace.it.*.*.*(..))")
    public Object loggerParamHandler(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object[] args = proceedingJoinPoint.getArgs();
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        LoggerParam methodAnnotation = Optional.of(proceedingJoinPoint).map(proceedingJoinPoint1 -> (MethodSignature) proceedingJoinPoint1.getSignature())
                .map(MethodSignature::getMethod).map(method -> method.getDeclaredAnnotation(LoggerParam.class)).orElse(null);
        LoggerParam classAnnotaion = Optional.of(proceedingJoinPoint).map(ProceedingJoinPoint::getTarget).map(Object::getClass)
                .map(clazz -> clazz.getAnnotation(LoggerParam.class)).orElse(null);

        if ( !ObjectUtils.isEmpty(methodAnnotation) || !ObjectUtils.isEmpty(classAnnotaion)){
            log.info("目标方法执行的方法名 [{}]:",methodName);
            log.info("目标方法执行的参数 [{}]:", Arrays.asList(args));
            log.info("目标方法执行的返回值 [{}]:",result);
            log.info("目标方法执行响应时间 [{}]:",end-start+":豪秒!");
        }
        return result;
    }
}
