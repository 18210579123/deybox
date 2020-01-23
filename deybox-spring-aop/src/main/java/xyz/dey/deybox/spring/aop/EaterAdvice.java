package xyz.dey.deybox.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class EaterAdvice {

    /**
     * 第一种方法：直接把PointCut注解在advice上
     */
    @Before("execution(* xyz.dey.deybox.spring.aop.Eater.eatCake())")
    public void washHands() {
        System.err.println("wash hands ==>");
    }

    /**
     * 第二种方法：多个advice用到这个切点，所以把这个切点提取出来，用一个空方法去模拟一下
     *
     * 当一个PointCut上定义了多个advice的时候，如何决定执行的先后顺序
     */
    @Pointcut("execution(* xyz.dey.deybox.*.aop.Eater.eatSteak())")
    public void eatSteak(){}


    @Before("eatSteak()")
    public void prepareKnife() {
        System.err.println("prepare a knife ==>");
    }

    @Before("eatSteak()")
    public void prepareFork() {
        System.err.println("prepare a fork ==>");
    }
}
