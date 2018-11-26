package employee.dto.test;

import employee.dto.Employee;
import employee.dto.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee_config.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDaoImpl");

        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstName("Isabelle");
        employee.setLastName("dos Santos Portes");

        // int result = employeeDao.create(employee);
        // int result = employeeDao.update(employee);
        // int result = employeeDao.delete(2);
        // Employee result = employeeDao.read(1);
        List<Employee> result = employeeDao.read();

        // System.out.println("Number of records updated : " + result);
        System.out.println("Employee : " + result);
    }
}
