package xyz.dey.deybox.list;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        //写在一行也没关系
        @SuppressWarnings("unchecked") ArrayList<Employee> list = new ListDemo().getEmployees();
        System.out.println(list);
    }

    private ArrayList getEmployees() {
        ArrayList list = new ArrayList();
        list.add(new Employee());
        return list;
    }
}
