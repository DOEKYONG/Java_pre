package week3.interface_;

import java.util.ArrayList;

public class Report {
    StringBuffer buffer = new StringBuffer();
    GradeSchool gradeSchool = GradeSchool.getSchool();

    ArrayList<Subject> subjectList = gradeSchool.getSubjectsList();

    String result() {
        for(int i = 0; i<subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            getFirst(subject);

            buffer.append("\n");
        }
        return buffer.toString();
    }


    String getFirst(Subject subject){
        ArrayList<Student> studentList = subject.getStudentList();
        for(int i =0; i<studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append("|");
            buffer.append("\t");
            buffer.append(student.getStudentNumber());
            buffer.append("|");
            buffer.append(" "+student.getMajorSubject().getSubjectName());
            buffer.append("\t");
             //buffer.append();
            getsecond(student,subject.getSubjectName());
            buffer.append("\n");
        }
        return buffer.toString();
    }


    String getsecond(Student student, String subjectName){
        GradeEvaluation basic = new BasicEvaluation();
        GradeEvaluation major = new MajorEvaluation();

        ArrayList<Score> scoreList = student.getScoreList();

        for (int i = 0 ; i < scoreList.size(); i++) {
            Score score = scoreList.get(i);
//            System.out.println("gradd" +subjectName);
            if(score.getSubject().getSubjectName().equals(subjectName)) {
                String grade ="";
                if(score.getSubject().getGradeType() == 0){
                    grade = major.getGrade(score.getScore());
                } else if(score.getSubject().getGradeType() == 1) {
                    grade = basic.getGrade(score.getScore());
                }
                buffer.append("|");
                buffer.append(score.getScore());
                buffer.append(grade);
                buffer.append("|");

            }
        }


        return  buffer.toString();
    }




}
