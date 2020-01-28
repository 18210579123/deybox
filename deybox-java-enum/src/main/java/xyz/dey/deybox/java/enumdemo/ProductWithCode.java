package xyz.dey.deybox.java.enumdemo;

public enum ProductWithCode {

    WINDOWS("win"), OFFICE("off"), AOE("aoe");

    private String code;

    //在Enum里面，其实构造函数不需要去声明为private类型，可以省略
    private ProductWithCode(String code) {
        this.code = code;
    }

    //Enum的构造函数永远是private的，如果声明为public或者protected会报错
//    private ProductWithCode(String code){


    public String getCode() {
        return code;
    }

}
