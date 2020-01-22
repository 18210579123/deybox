package xyz.dey.deybox.spring.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Context的配置类，通过Java的方式去配置
 * （第一代：xml  第二代：annotation 第三代：java）
 *
 * 这个地方如果只是配置了一个@Configuration，没有配扫描@ComponentScan，会报错：
 * Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
 * No qualifying bean of type 'GreetingService' available
 */
@Configuration
@ComponentScan("xyz.dey.deybox")
public class DeyConfig {
}
