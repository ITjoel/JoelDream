package day.day20190522;

/**
 * @author 贾源强
 * @version V1.0
 * @Package day.day20190522
 * @date 2019/5/22 23:03
 * @Copyright © 2019-2020 小强股份有限公司
 */
public class EmployeeBySalary implements EmployeeBy<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() >= 5000;
    }
}
