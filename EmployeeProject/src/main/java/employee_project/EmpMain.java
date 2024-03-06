package employee_project;

import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmpMain {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Employee Management System");
        System.out.println("Please enter your choice ");
        System.out.println("1.Add Employees \n 2. Remove Employee \n 3. Show Employee details \n" +
                "4. Change Salary \n5. Display All Employee ID \n6. Exit");
        int i = sc.nextInt();

        do {
            switch (i){
                case 1:
                    System.out.println("Please enter the Employee Name");
                    String name = sc.next();
                    System.out.println("Please enter the Employee ID");
                    int id = sc.nextInt();
                    System.out.println("Please enter the Employee Department");
                    String department = sc.next();
                    System.out.println("Please enter the Employee Salary");
                    double salary = sc.nextDouble();
                    system.addEmployee(name,id,department,salary);

                case 2:
                    System.out.println("Please ");
                default:

            }
        }

        while (i != 6);

        system.getAllId();
        }
    }
