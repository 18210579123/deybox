package xyz.dey.deybox.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //这个是必须的，因为要被实例化成bean
public class EaterAdviceWithParameter {

    /**
     * 原来的方法eatPizza的参数是一个String，
     * 这儿通过args()表达式把这个参数赋值给name，
     * 然后这个参数需要和advice中的参数同名
     */
    @Before("execution(* xyz.dey.deybox.spring.aop.Eater.eatPizza(..)) && args(name))")
    public void washHands(String name) {
        System.err.println("wash hands before eat ==> " + name);
    }

    /**
     * 对象作为参数的时候，不用在参数中写进去完整的包名
     */
    @Before("execution(* xyz.dey.deybox.spring.aop.Eater.eatPizza(Pizza)) && args(pizza))")
    public void washHands(Pizza pizza) {
        System.err.println("wash hands before eat ==> " + pizza.getName());
    }

}
