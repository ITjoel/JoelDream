package day.day20190522;

/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190522
 * @date 2019/5/22 22:45
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class Employee {
    private String name;
    private Integer age;
    private Double salary;


    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
