package Assignments.Polymorphism.Payroll;

public class PayrollDemo {
    public static void main(String[] args) {
        FullTime ft = new FullTime("Dinesh","101",160);
        PartTime pt = new PartTime("Suganya","23", 160);
        System.out.println("The salary of " + ft.empName + " for "+ft.baseHours+ " hours of work is: "+ft.calculatePay());
        System.out.println("The salary of " + pt.empName + " for "+pt.baseHours+ " hours of work is: "+pt.calculatePay());

    }

}
