package xyz.dey.deybox.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeyJavaConfig {

    /**
     * 其实上面也完全可以调用这个helloService()方法去获得helloService
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

    /**
     * 通过Java代码配置Bean（替代了xml）,
     * 这个时候每个Service都没有配置任何@Service或者@Autowired注解,但是可以正常使用。
     *
     * 加上@Bean的意思就是，这个方法会返回一个bean，容器要管理起来
     */
    @Bean
    public GreetingService greetingService() {
        HelloService helloService = new HelloService();
        GreetingService greetingService = new GreetingService();
        greetingService.setHelloService(helloService);
        return greetingService;
    }

    /**
     * 第二种方法：
     * 可以把前面已经生成的Bean，作为后面的构造过程的参数，会自动使用
     * (想想xml构造的情况，就可以理解这儿了）
     */
//    @Bean
//    public GreetingService greetingService(HelloService helloService){
//        GreetingService greetingService = new GreetingService();
//        greetingService.setHelloService(helloService);
//        return greetingService;
//    }
}
