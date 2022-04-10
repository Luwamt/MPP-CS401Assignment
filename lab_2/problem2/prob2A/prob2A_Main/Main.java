package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2A.prob2A_Main;

import mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2A.GradeReport;
import mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2A.Student;

public class Main {

    public static void main(String[] args) {

        //GradeReport report1 = new GradeReport(std);//
        Student std = new Student("Luwam");
        //std.getReport();
        System.out.println("From Student: "+std.getName());

        GradeReport report1 = std.getReport();
        System.out.println("From GradeReport: "+report1.getStudent().getName());



    }

}
