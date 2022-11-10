package week2.file;

import java.util.ArrayList;

public class GradeSchool {

    private static GradeSchool instance = new GradeSchool();
    private GradeSchool(){}
    GradeDB gradeDB = new GradeDB();
    ArrayList<Grade> gradelist = gradeDB.Readfile();

    public  static GradeSchool getSchool(){
        if(instance == null) {
            instance = new GradeSchool();
        }
        return instance;
    }
    public Grade getGrade(){
       // System.out.println("확인요유 "+gradelist);
        Grade grade = new Grade();
        return grade;
    }



}
