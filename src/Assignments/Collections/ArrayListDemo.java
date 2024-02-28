package Assignments.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Test1","test1@gmail.com",10,"USA"));
        list.add(new Employee("Test2","test2@gmail.com",35,"Canada"));
        list.add(new Employee("Test3","test3@gmail.com",23,"India"));
        list.add(new Employee("Test4","test4@gmail.com",44,"Spain"));
        list.add(new Employee("Test5","test5@gmail.com",50,"Canada"));

        List<Employee> over30 = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age > 30) {
                over30.add(employee);
            }
        }
        System.out.println("Employees with age over 30:");
        for (Employee employee : over30) {
            System.out.println(employee.name);
        }
        List<Employee> inCanada = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.country.equals("Canada") ) {
                inCanada.add(employee);
            }
        }
        System.out.println();
        System.out.println("Employees in Canada:");
        for (Employee employee : inCanada) {
            System.out.println(employee.name);
        }
    }
}
