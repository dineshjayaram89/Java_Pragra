package employee_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagementSystem {
    private final Map<Integer,Employee> emp;
    public EmployeeManagementSystem() {
        emp = new HashMap<>();
        emp.put(1,new Employee("Test",1,"Test",100000));
    }
    public void addEmployee(String name, int id, String department, double salary) {
        if (emp.containsKey(id))
        {
            System.out.println("The ID provided is already in the system");
            System.out.println(emp.get(id));
        }
        emp.put(id,new Employee(name,id,department,salary));
    }
    public void removeEmployee(int id){
        emp.remove(id);
    }
    public void empDetails(int id){
        System.out.println(emp.get(id));
    }
    public void changeSalary(int id, double salary){
        if (emp.containsKey(id)){
            Employee e = emp.get(id);
            e.setSalary(salary);
            emp.put(id,e);
        }
        else {
            System.out.println("The ID provided is not in the system");
        }
    }
    public void getAllId(){
        System.out.println("Current list of Employees");
        for (Map.Entry<Integer, Employee> integerEmployeeEntry : emp.entrySet()) {
            System.out.println(integerEmployeeEntry.getKey());
        }
    }
    public void getAllDetails(){
        System.out.println("Current list of Employees");
        for (Map.Entry<Integer, Employee> integerEmployeeEntry : emp.entrySet()) {
            System.out.println(integerEmployeeEntry.getValue());
        }
    }
}
