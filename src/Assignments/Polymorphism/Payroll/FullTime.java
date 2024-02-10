package Assignments.Polymorphism.Payroll;

public class FullTime extends Employee{
    double baseHours;

    public FullTime(String empName, String empId,double baseHours) {
        super(empName, empId);
        super.empType = "Full Time";
        this.baseHours = baseHours;
    }

    @Override
    public double calculatePay() {
        return (baseHours * 45);
    }
}
