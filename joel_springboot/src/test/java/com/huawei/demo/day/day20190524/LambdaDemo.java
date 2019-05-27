package com.huawei.demo.day.day20190524;

import com.huawei.demo.day.day20190522.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190524
 * @date 2019/5/24 22:25
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class LambdaDemo {

    List<Employee> list = Arrays.asList(
            new Employee("李四", 18, 4444.44),
            new Employee("张三", 18, 3333.33),
            new Employee("王五", 38, 5555.55),
            new Employee("赵六", 38, 6666.66)
    );

    @Test
    public void test1() {
        Collections.sort(list, (e1, e2) -> {
            if (e1.getAge().equals(e2.getAge())) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
