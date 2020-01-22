package com.dey.deybox.spring.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 一个引用了其他Service的Service。
 *
 * 这个地方是配Service，还是Controller，还是Repository，还是Component，都一样的效果;
 * 但是不能配置@Bean，因为@Bean只能修饰方法
 */
@Service
//@Repository
//@Controller
//@Component
public class GreetingService {


    /**
     * 这个地方用Autowired，用Resource都一样，一个就行
     */
    @Autowired
    @Resource
    private HelloService helloService;

    public void greeting(){
        helloService.hello();
    }
}
