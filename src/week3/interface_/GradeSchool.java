package week3.interface_;

import week2.file.Grade;

import java.util.ArrayList;

public class GradeSchool {
    private static GradeSchool instance = new GradeSchool();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Subject> subjectsList = new ArrayList<>();
    private GradeSchool(){}

    public  static GradeSchool getSchool(){
        if(instance == null) {
            instance = new GradeSchool();
        }
        return instance;
    }

    void addStudent(Student student){
        studentList.add(student);
    }
    void addSubject(Subject subject){
        subjectsList.add(subject);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }
}
