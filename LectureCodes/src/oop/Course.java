package oop;

public class Course {
    private String courseName;
    private String code;

    public Course(String courseName, String code) {
        this.courseName = courseName;
        this.code = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double calcAverage(Student[] students){
        double average =0;
        for (Student student : students) {
            average += student.getNote();
        }

        return average/students.length;
    }
}
