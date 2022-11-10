package week2.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeStart {
    public static void main(String[] args) {
        GradeSchool gradeSchool = GradeSchool.getSchool();
        Grade grade1 = gradeSchool.getGrade();
        //Grade grade2 = gradeSchool.getGrade();
        grade1.print(1001);
       // grade2.print(1002);
        //grade2.print();


    }
}
