package Assignments.Polymorphism.Payroll;

public class PartTime extends Employee{

    double baseHours;
    public PartTime(String empName, String empId, double baseHours) {
        super(empName, empId);
        super.empId = "Part Time";
        this.baseHours = baseHours;
    }

    @Override
    public double calculatePay() {
        return (baseHours * 0.5 * 45);
    }
}
