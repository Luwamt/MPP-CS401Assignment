package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;

public class Salaried extends  Employee{

    private double salary;
    public Salaried(int id, int salary){
        super(id);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
