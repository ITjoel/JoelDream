package com.huawei.demo.day.day20190526;


import com.huawei.demo.day.day20190522.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190526
 * @date 2019/5/26 22:06
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class LambdaFilter {

    List<Employee> list = Arrays.asList(
            new Employee("李四", 59, 6666.66),
            new Employee("张三", 18, 9999.99),
            new Employee("王五", 28, 3333.33),
            new Employee("赵六", 8, 7777.77),
            new Employee("赵六", 8, 7777.77),
            new Employee("赵六", 8, 7777.77),
            new Employee("田七", 8, 5555.55),
            new Employee("孙八", 8, 5555.55)
    );

    //1. 创建 Stream
    @Test
    public void test() {
        //1. Collection 提供了两个方法  stream() 与 parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream(); //获取一个顺序流
        Stream<String> parallelStream = list.parallelStream(); //获取一个并行流

        //2. 通过 Arrays 中的 stream() 获取一个数组流
        Integer[] nums = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(nums);

        //3. 通过 Stream 类中静态方法 of()
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);

        //4. 创建无限流
        //迭代
        Stream<Integer> stream3 = Stream.iterate(0, (x) -> x + 2).limit(10);
        stream3.forEach(System.out::println);

        //生成
        Stream.generate(Math::random).limit(6).skip(3).forEach(System.out::println);

    }

    /*
	  筛选与切片
		filter——接收 Lambda ， 从流中排除某些元素。
		limit——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
	 */

    @Test
    public void test1() {
        list.stream().filter((x) -> x.getAge() >= 25).forEach(System.out::println);
    }


    @Test
    public void test2() {
        list.stream().filter((x) -> x.getAge() >= 25).forEach(System.out::println);
    }

    @Test
    public void test3() {
        list.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test4() {
        List<String> names = new ArrayList<>(10);
        list.stream().map((x) -> x.getName()).distinct();
    }

}
