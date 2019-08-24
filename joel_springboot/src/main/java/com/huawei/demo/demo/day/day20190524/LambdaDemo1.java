package com.huawei.demo.demo.day.day20190524;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190524
 * @date 2019/5/24 23:10
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class LambdaDemo1 {
    /**
     * java8内置四大核心函数式接口
     * Consumer<T> 消费型接口
     * void accept(T,t);
     * Supplier<T> 供给型接口
     * T get();
     * Function<T,R> 函数型接口
     * R apply(T,t);
     * Predicate<T> 断言型接口
     * R boolean test(T t);
     */

    //需求1:消费1000元大宝剑
    @Test
    public void test1() {
        happy(1000, x -> System.out.println("shuang"));
    }

    public void happy(Integer money, Consumer<Integer> con) {
        con.accept(money);
    }

    //需求2:产生指定个整数,并把整数放到集合中
    @Test
    public void test2() {
        List<Integer> list = getNumberList(5, () -> (int) (Math.random() * 30));
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public List<Integer> getNumberList(int num, Supplier<Integer> sup) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }

    //需求3:处理字符串
    @Test
    public void test3() {
        String str = handlerStr("  我爱你丫头 \t  ", (x) -> x.trim());
        System.out.println(str);
    }

    public String handlerStr(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    //满足条件的字符串放入到集合中

    @Test
    public void test4() {
        List<String> strings = filterStr(Arrays.asList("haha", "nihao", "ok"), x -> x.length() > 4);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> arrayList = new ArrayList<>();
        for (String s : arrayList) {
            if (pre.test(s)) {
                arrayList.add(s);
            }
        }
        return list;
    }

}
