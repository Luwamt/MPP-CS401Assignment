package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2A;

public class GradeReport {

    private Student student;
// make package level
    GradeReport(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return student.getName() ;
    }
}
