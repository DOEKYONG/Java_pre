package week2.file;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradeSchool {
    private static GradeSchool instance = new GradeSchool();
    private GradeSchool(){}

    public  static GradeSchool getSchool(){
        if(instance == null) {
            instance = new GradeSchool();
        }
        return instance;
    }
    public Grade getGrade(){
        // System.out.println("확인요유 "+gradelist);
        Grade grade = new Grade(Readfile());
        return grade;
    }

    ArrayList<Grade> Readfile() {
        try {
            ArrayList<Grade> student = new ArrayList<>();
            BufferedReader in = new BufferedReader(new FileReader("/Users/shindeokyong/Desktop/file_java/input.txt"));
            String s;
            while ((s = in.readLine()) != null) {
                Map<String, Integer> map = new HashMap<>();
                ArrayList<Map> subject = new ArrayList<>();
                String[] split = s.split("/");
                String name = split[0];
                int number = Integer.valueOf(split[1]);
                String major = split[2];
                //list.add(Integer.valueOf(split[i]));
                if(Integer.valueOf(split[3]) != -1) {
                    map.put("국어", map.getOrDefault("국어", Integer.valueOf(split[3])));
                }
                if(Integer.valueOf(split[4]) != -1){
                    map.put("수학", map.getOrDefault("수학", Integer.valueOf(split[4])));
                }
                if (Integer.valueOf(split[5]) != -1) {
                    map.put("영어", map.getOrDefault("영어", Integer.valueOf(split[5])));
                }
                subject.add(map);
                Grade grade = new Grade(name, number, major, subject);
                student.add(grade);
            }
            in.close();
            return student;
        } catch (IOException e) {
            System.err.println("에러?"+e);
            System.exit(1);
        }
        return null;
    }
}
