package xyz.dey.deybox.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lmabda表达式，用来传递一个可以重复执行的代码块。不用再像以前，把代码都要封到一个对象里面去。
 *
 * 而且lambda表达式可以直接赋值给一个对象。
 */
@Slf4j
public class A1LambdaComparator {
    public static void main(String[] args) {
        Integer[] numbers = {1, 12, 5};

        //1. 常规排序
        Arrays.sort(numbers);
        print(numbers);

        //2. 手工创建一个Comparator，倒着排一下
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }
        };
        Arrays.sort(numbers, comparator);
        print(numbers);

        //3. lambda表达式，标准形式（全写上: 参数括号，参数类型，代码块括号，return符号）
        Arrays.sort(numbers, (Integer i1, Integer i2) -> {
            return i1 - i2;
        });
        print(numbers);

        //4. lambda表达式，简写形式（没有参数类型，没有代码块括号，没有return)
        Arrays.sort(numbers, (i1, i2) -> -(i1 - i2));
        print(numbers);

        //5. 把lambda表达式直接赋值给comparator(函数式接口，有FunctionalInterface注解）
        Comparator<Integer> comparator1 = (i1, i2) -> i1 - i2;
        Arrays.sort(numbers, comparator1);
    }

    private static void print(Integer[] numbers) {
        for (int i : numbers) {
            log.info("{}", i);
        }
        log.info("------------");
    }
}
