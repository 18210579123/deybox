package xyz.dey.deybox.excel;

public class Pair2<T, U> {
    private T first;
    private U second;

    public Pair2(){}

    public Pair2(T first, U second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second){
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public U getSecond(){
        return this.second;
    }
}
