package xyz.dey.deybox.spring.javaconfig;

public class GreetingService {

    private HelloService helloService;

    public void greeting(){
        helloService.hello();
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
