package xyz.dey.deybox.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EaterAroundAdvice {

    /**
     * prepare fork and knife ==>
     * clean your teeth ==>
     * eat seafood
     *
     * 结果可能是这样，不保证先后顺序？
     * 不会的，是因为advice用的是System.err，
     * 连接点里面的原始方法用的是System.out，导致顺序不对
     */
    @Around("execution(* xyz.dey.deybox.spring.aop.Eater.eatSeafood(..))")
    public void seafoodProgress(ProceedingJoinPoint joinPoint){
        System.err.println("prepare fork and knife ==>");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.err.println("clean your teeth ==>");
    }
}
