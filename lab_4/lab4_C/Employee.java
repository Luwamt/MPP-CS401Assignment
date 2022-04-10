package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;

public abstract class Employee {
    private int empId;

    public Employee(int id ){
        empId = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void  print(){
    }

    public Paycheck calcCompensation(int month , int year) {
        double grossPay = calcGrossPay(month, year);
        Paycheck monthlyPaycheck = new Paycheck(grossPay, 23, 5, 1, 3, 7.5);
        return monthlyPaycheck;
    }

    public abstract double calcGrossPay(int month, int year);
}
