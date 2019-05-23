package day.day20190522;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190522
 * @date 2019/5/22 22:48
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class TestLambda {

    List<Employee> list = Arrays.asList(
            new Employee("张三", 10, 3333.33),
            new Employee("李四", 20, 4444.44),
            new Employee("王五", 30, 5555.55),
            new Employee("赵六", 50, 6666.66)
    );

    @Test
    public void testFilter() {
        List<Employee> list1 = filterEmployee(list, new EmployeeByAge());
        for (Employee employee : list1) {
            System.out.println(employee);
        }
    }

    // 设计模式策略模式
    public List<Employee> filterEmployee(List<Employee> list, EmployeeBy<Employee> employeeByAge) {
        List<Employee> ls = new ArrayList<>(10);
        for (Employee emp : list) {
            if (employeeByAge.test(emp)) {
                ls.add(emp);
            }
        }
        return ls;
    }

    // 匿名内部类
    @Test
    public void test2() {
        List<Employee> list1 = filterEmployee(list, new EmployeeBy<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() <= 4000;
            }
        });

        for (Employee employee : list1) {
            System.out.println(employee);
        }
    }

    // lambda 表达式
    @Test
    public void test3() {
        List<Employee> list1 = filterEmployee(list, (e) -> e.getSalary() <= 4000);
        list1.forEach(System.out::println);
    }

    //Stream API
    @Test
    public void test4() {
        list.stream().filter((e) -> e.getSalary() >= 3000).forEach(System.out::println);
    }
}
