package xyz.dey.deybox.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceCaller {
    public void call() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DeyJavaConfig.class);
        GreetingService greetingService = applicationContext.getBean(GreetingService.class);
        greetingService.greeting();
    }


}
