package week2.file;

import java.util.ArrayList;

public class Grade {
    private String name;
    private int number;
    private String major;
    private ArrayList<Integer> subject;
    private ArrayList<Grade> grades ;

     Grade(){}

    public Grade(int number) {
        this.number = number;
    }
    public Grade(String name, int number, String major, ArrayList<Integer> subject) {
        this.name = name;
        this.number = number;
        this.major = major;
        this.subject = subject;
    }

    ArrayList<Grade> save(){
        GradeDB gradeDB = new GradeDB();
        ArrayList<Grade> list = gradeDB.Readfile();
        grades = list;
        return grades;
    }
    int sum(int num){
         int sum = 0;
         //int average =0;
         for(int i = 0 ; i<grades.size(); i++) {
             if(num == grades.get(i).number){
                 for(int j = 0; j< grades.get(i).subject.size(); j++) {
                     sum +=grades.get(i).subject.get(j);
                 }
             }
         }
        return sum;
    }
    void print (int num){
        save();
         for(int i = 0 ; i<grades.size(); i++){
             if(num == grades.get(i).number){
                 for(int j = 0; j< grades.get(i).subject.size(); j++) {
                     System.out.println(grades.get(i).name+" 학생은 " + grades.get(i).subject.size() +
                             "과목을 수강했습니다.");
                     System.out.println("총점은 " + sum(num) +"점이고 평균은 "+ sum(num)/grades.get(i).subject.size()+"점 입니다.");
                 return;
                 }
             }
         }
    }
    // 입력받고 리스트에  추가,수정 기능 작업 후 input파일 수정후 저장 해야됨..
//    public Grade createGrade(){
//         grades.add(new Grade())
//    }

//    @Override
//    public String toString() {
//        return "Grade{" +
//                "name='" + name + '\'' +
//                ", number=" + number +
//                ", major='" + major + '\'' +
//                ", subject=" + subject +
//                '}';
//    }
}
