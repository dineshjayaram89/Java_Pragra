package employee_project;

import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        EmployeeManagementSystem empSystem = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);
        int i = 5;

        try {
            do {
                System.out.println("Welcome to the Employee Management System");
                System.out.println("Please enter your choice ");
                System.out.println("""
                        1. Add Employees\s
                        2. Remove Employee\s
                        3. Show Employee details\s
                        4. Change Salary\s
                        5. Display All Employee Details\s
                        6. Exit""");
                i = sc.nextInt();
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
                        empSystem.addEmployee(name,id,department,salary);
                        System.out.println("Employee was added successfully");
                        continue;

                    case 2:
                        System.out.println("Please enter the employee id to delete");
                        empSystem.getAllDetails();
                        int idToRemove = sc.nextInt();
                        System.out.println("The below Employee will be removed!");
                        empSystem.empDetails(idToRemove);
                        empSystem.removeEmployee(idToRemove);
                        System.out.println("Employee was removed successfully");
                        continue;

                    case 3:
                        System.out.println("Please enter the employee id to display");
                        empSystem.getAllId();
                        int idToDisplay = sc.nextInt();
                        empSystem.empDetails(idToDisplay);
                        continue;

                    case 4:
                        System.out.println("Please enter the id of the employee the salary change is needed");
                        empSystem.getAllId();
                        int salID = sc.nextInt();
                        empSystem.empDetails(salID);
                        System.out.println("Please enter the new salary");
                        double sal = sc.nextDouble();
                        empSystem.changeSalary(salID,sal);
                        System.out.println("Employee's Salary was changed successfully");
                        continue;

                    case 5:
                        empSystem.getAllDetails();
                        continue;

                    case 6:
                        break;

                    default:
                        System.out.println("Please enter only provided options");
                }
            }
            while (i != 6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }
