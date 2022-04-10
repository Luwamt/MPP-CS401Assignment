package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;

public class Hourly extends  Employee{


    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(int id , double hourlyWage , double hoursPerWeek) {
        super(id);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return   this.hourlyWage * this.hoursPerWeek * 4;
    }
}
