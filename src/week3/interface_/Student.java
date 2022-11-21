package week3.interface_;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentNumber;
    private Subject majorSubject;
    private String essentialSubject;
    private ArrayList<Score> scoreList = new ArrayList<>();

//    public Student(String studentName, int studentNumber, String majorSubject, Subject essentialSubject) {
//        this.studentName = studentName;
//        this.studentNumber = studentNumber;
//        this.majorSubject = majorSubject;
//        this.essentialSubject = essentialSubject;
//    }


    public Student(String studentName, int studentNumber, Subject majorSubject, String essentialSubject) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.majorSubject = majorSubject;
        this.essentialSubject = essentialSubject;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }



    public String getEssentialSubject() {
        return essentialSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }




    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    void addScoreList(Score score){
        scoreList.add(score);
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", majorSubject='" + majorSubject + '\'' +
                ", essentialSubject=" + essentialSubject +
                ", scoreList=" + scoreList +
                '}';
    }
}
