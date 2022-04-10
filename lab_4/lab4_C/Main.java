package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_C;

public class Main {

    public static void main(String[] args) {


        // Create hourly employee
        Employee hourly1 = new Hourly(1, 12,40);
        Paycheck hourly1Chek = hourly1.calcCompensation(1, 2021);
        hourly1Chek.print();
    }
}
