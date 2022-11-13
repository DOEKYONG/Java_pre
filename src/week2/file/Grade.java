package week2.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Grade {
    private String name;
    private int number;
    private String major;
    private ArrayList<Map> subject;
    private ArrayList<Grade> grades ;

    private Grade(){}

    public Grade(int number) {
        this.number = number;
    }
    public Grade(String name, int number, String major, ArrayList<Map> subject) {
        this.name = name;
        this.number = number;
        this.major = major;
        this.subject = subject;
    }

//    public int getNumber() {
//        return number;
//    }

    public Grade(ArrayList<Grade> grades) {
        this.grades = grades;
    }


     private int  sum(int inNum) {
            int sum =0;
            for (Grade temp : grades) {
                if(temp.number == inNum) {
                    //temp.subject.stream().mapToInt();
                    int length = temp.subject.get(0).values().toArray().length;
                    for(int i = 0; i<length; i++){
                          sum += (int) temp.subject.get(0).values().toArray()[i];
                    }
                }
            }
        return sum;
    }

   private int subjectLength(int inNum){
        int length = 0 ;
        for (Grade temp : grades) {
            if(temp.number == inNum) {
                length = temp.subject.get(0).values().toArray().length;
            }
        }
        return length;
    }
    void print(int inNum) {
            for(Grade temp : grades) {
                if (temp.number == inNum) {
                    System.out.println(temp.name + " 학생은 " + subjectLength(inNum)  + "과목을 수강했습니다.");
                    System.out.println("총점은" + sum(inNum) + "이고 평균은" + sum(inNum) / subjectLength(inNum) + "점입니다.");
                }
            }
}
 void showAll(){
        System.out.println(grades);
 }
     void write(String name,String major,int korean,int math,int english) {

        try {
            // 1. 파일 객체 생성
            File file = new File("/Users/shindeokyong/Desktop/file_java/input.txt");
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
            // 3. Buffer를 사용해서 File에 write할 수 있는 BufferedWriter 생성
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fw);
            // 4. 파일에 쓰기
            writer.write(name+"/"+(int)(grades.get(grades.size()-1).number+1)+"/"+major+"/"+korean+"/"+math+"/"+english);
            writer.newLine();
            // 5. BufferedWriter close
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void update(int inNum,String inSubject,int score){
        GradeSchool gradeSchool = GradeSchool.getSchool();

        try {
            for(Grade temp : grades){
                if(temp.number == inNum) {
                    if(temp.subject.get(0).containsKey(inSubject)){
                        temp.subject.get(0).replace(inSubject,score);
                        //System.out.println(grades);
                    } else {
                        return;
                    }
                }
            }
            // 1. 파일 객체 생성
            File file = new File("/Users/shindeokyong/Desktop/file_java/input.txt");
            // 2. 파일 존재여부 체크 및 생성
            if (!file.exists()) {
                file.createNewFile();
            }
            // 3. Buffer를 사용해서 File에 write할 수 있는 BufferedWriter 생성
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            // 4. 파일에 쓰기
            for(Grade temp : grades){
               int korean =-1;
                int math = -1;
                int english =-1;
                if(temp.subject.get(0).containsKey("국어")){
                     korean = (int)temp.subject.get(0).get("국어");
                }
                if(temp.subject.get(0).containsKey("수학")){
                    math = (int)temp.subject.get(0).get("수학");
                }
                if(temp.subject.get(0).containsKey("영어")){
                    english = (int)temp.subject.get(0).get("영어");
                }
                writer.write(temp.name+"/"+temp.number+"/"+temp.major+"/"+korean+"/"+math+"/"+english);
                writer.newLine();
            }
            // 5. BufferedWriter close
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", major='" + major + '\'' +
                ", subject=" + subject +
                '}';
    }
}
