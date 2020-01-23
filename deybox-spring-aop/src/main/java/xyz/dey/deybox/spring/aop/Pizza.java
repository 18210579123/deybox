package xyz.dey.deybox.spring.aop;

public class Pizza {

    public Pizza() {

    }

    public Pizza(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
