package week2.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GradeDB {
    ArrayList<Grade> Readfile(){
        try {
            ArrayList<Grade> student = new ArrayList<>();
            ArrayList<Integer> subject = new ArrayList<>();
            BufferedReader in = new BufferedReader(new FileReader("/Users/shindeokyong/Desktop/file_java/input.txt"));
            String s;
            while ((s = in.readLine()) != null) {
                ArrayList<Integer> list = new ArrayList<>();
                String[] split = s.split("/");
                int length = split.length;
                String name = split[0];
                int number = Integer.valueOf(split[1]);
                String major = split[2];
                for (int i =3 ; i < length; i++){
                    list.add(Integer.valueOf(split[i]));
                }
                subject = list;
                Grade grade = new Grade(name,number,major,subject);
                student.add(grade);
            }
            in.close();
            return student;
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        return null;
    }


}
