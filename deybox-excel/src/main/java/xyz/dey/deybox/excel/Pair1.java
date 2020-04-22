package xyz.dey.deybox.excel;

public class Pair1<T> {
    private T first;
    private T second;

    public Pair1(){}

    public Pair1(T first, T second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(T second){
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }

    public static void main(String[] args) {
        int a = 1_0000_1111;
        System.out.println(a * 2);

        int b = 0b0100;
        System.out.println(b * 2);
    }
}
