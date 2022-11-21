package week3.interface_;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int gradeType;

    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, int gradeType) {
        this.subjectName = subjectName;
        this.gradeType = gradeType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    void addSubject(Student student){
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", gradeType=" + gradeType +
                '}';
    }
}
