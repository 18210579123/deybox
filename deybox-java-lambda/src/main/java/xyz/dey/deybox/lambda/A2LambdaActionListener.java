package xyz.dey.deybox.lambda;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

@Slf4j
public class A2LambdaActionListener {
    public static void main(String[] args) {
//        m1();
//        m2();
        m3();
    }

    //1. 普通的time使用方式，构建一个ActionListener，监听timer发出的ActionEvent
    public static void m1() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log.info(String.valueOf(new Date()));
            }
        };
        Timer timer = new Timer(1000, listener);
        timer.start();

//        JOptionPane.showMessageDialog(null, "Quit");
//        System.exit(0);
    }

    /**
     * 2. 通过赋值的方式，把lambda表达式赋值给ActionListener。并且，因为只有一个参数，省略参数括号
     * 为什么lambda表达式可以赋值给ActionListener呢，因为他是一个函数式接口。
     * 虽然comparator接口有很多方法，但是他只有一个抽象方法，其他要么是static、要么是default、要么是Object的
     */

    public static void m2() {
        ActionListener listener = e -> log.info(String.valueOf(new Date()));
        Timer timer = new Timer(1000, listener);
        timer.start();
//        JOptionPane.showMessageDialog(null, "Quit");
//        System.exit(0);
    }

    /**
     * 3. 直接在调用处，使用lambda表达式
     * 为什么这儿可以这么写呢？因为这儿是要调用一个listener，而lambda表达式可以赋值给listener。
     */

    public static void m3() {
        Timer timer = new Timer(1000, e -> log.info(String.valueOf(new Date())));
        timer.start();
//        JOptionPane.showMessageDialog(null, "Quit");
//        System.exit(0);
    }
}
