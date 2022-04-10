package mpp_cs401_assignments.MPP_CS401Assignment.lab_2.problem2.prob2A;

public class Student {
    private String name;
    private GradeReport report;

    public Student(String name) {
        this.name = name;
        this.report = new GradeReport(this);
    }

    /*public Student(String name, GradeReport report) {
        this.name = name;
        this.report = report;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradeReport getReport() {
        return report;
    }

    public void setReport(GradeReport report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", report=" + report +
                '}';
    }
}
