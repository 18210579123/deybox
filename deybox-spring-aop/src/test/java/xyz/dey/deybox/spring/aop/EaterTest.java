package xyz.dey.deybox.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Configuration //这个地方@Configuration标签不加，是不影响效果的
@EnableAspectJAutoProxy //这个注解不加在这儿，加在一个componnet上，效果一样的。但是需要考虑顺序
@ComponentScan("xyz.dey.*") //这个地方是需要的，因为被作为Configuration传到context里面了
public class EaterTest {

    /**
     * 这种情况下由于eater是直接new出来的，不是容器中构建的，所有切面不会生效
     */
    @Test
    public void eatCake() {
        Eater eater = new Eater();
        eater.eatCake();
    }

    @Test
    public void eatCake2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EaterTest.class);
        Eater eater = applicationContext.getBean(Eater.class);
        eater.eatCake();
    }

    @Test
    public void eatSteak() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EaterTest.class);
        Eater eater = applicationContext.getBean(Eater.class);
        eater.eatSteak();
    }

    @Test
    public void eatPizzaByName() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EaterTest.class);
        Eater eater = applicationContext.getBean(Eater.class);
        eater.eatPizza("seafood pizza");
    }

    @Test
    public void eatPizzaByPizza() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EaterTest.class);
        Eater eater = applicationContext.getBean(Eater.class);
        eater.eatPizza(new Pizza("seafood pizza2"));
    }

    @Test
    public void seafoodProgress(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EaterTest.class);
        Eater eater = applicationContext.getBean(Eater.class);
        eater.eatSeafood();
    }
}