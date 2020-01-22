package xyz.dey.deybox.spring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用AnnotationConfigApplicationContext 直接new一个ApplicationContext
 * 当然，需要传入配置类参数
 */
public class ServiceCaller {

    /**
     * 这个地方，如果没有为AnnotationConfigApplicationContext配置参数，会报错：
     * Exception in thread "main" java.lang.IllegalStateException:
     * org.springframework.context.annotation.AnnotationConfigApplicationContext@21b8d17c
     * has not been refreshed yet
     * 只有设置了参数，才会refresh，通过初始化的状态
     */
    public void call(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DeyConfig.class);
        GreetingService greetingService = applicationContext.getBean(GreetingService.class);
        greetingService.greeting();
    }

    public static void main(String[] args) {
        new ServiceCaller().call();
    }
}
