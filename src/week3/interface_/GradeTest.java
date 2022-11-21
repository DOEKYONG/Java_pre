package week3.interface_;

public class GradeTest {
    public static void main(String[] args) {

        GradeSchool gradeSchool = GradeSchool.getSchool();
        Subject korean;
        Subject math;

        korean = new Subject("국어");
        math = new Subject("수학");
        gradeSchool.addSubject(korean);
        gradeSchool.addSubject(math);

        Student student1 = new Student("강감찬",211213,korean,"국어국문학과");
        Student student2 = new Student("김유신",212330,math,"컴퓨터공학과");
        Student student3 = new Student("신사임당",201518,korean,"국어국문학과");
        Student student4 = new Student("이순신",202360,korean,"국어국문학과");
        Student student5 = new Student("홍길동",201290,math,"컴퓨터공학과");

        Score score1 = new Score(211213,new Subject("국어",0),95);
        Score score1_2 = new Score(211213,new Subject("수학",1),56);
        Score score2 = new Score(212330,new Subject("국어",1),95);
        Score score2_2 = new Score(212330,new Subject("수학",0),98);
        Score score3 = new Score(201518,new Subject("국어",0),100);
        Score score3_2 = new Score(201518,new Subject("수학",1),88);
        Score score4 = new Score(202360,new Subject("국어",0),89);
        Score score4_2 = new Score(202360,new Subject("수학",1),95);
        Score score5 = new Score(201290,new Subject("국어",1),83);
        Score score5_2 = new Score(201290,new Subject("수학",0),56);

        student1.addScoreList(score1);
        student1.addScoreList(score1_2);
        student2.addScoreList(score2);
        student2.addScoreList(score2_2);
        student3.addScoreList(score3);
        student3.addScoreList(score3_2);
        student4.addScoreList(score4);
        student4.addScoreList(score4_2);
        student5.addScoreList(score5);
        student5.addScoreList(score5_2);

        gradeSchool.addStudent(student1);
        gradeSchool.addStudent(student2);
        gradeSchool.addStudent(student3);
        gradeSchool.addStudent(student4);
        gradeSchool.addStudent(student5);



        korean.addSubject(student1);
        korean.addSubject(student2);
        korean.addSubject(student3);
        korean.addSubject(student4);
        korean.addSubject(student5);

        math.addSubject(student1);
        math.addSubject(student2);
        math.addSubject(student3);
        math.addSubject(student4);
        math.addSubject(student5);


        System.out.println(gradeSchool.getStudentList());
        Report report = new Report();
        System.out.println(" 수강생 학점 \t\t");
        System.out.println(" 이름  |  학번  |중점과목| 점수");



//        System.out.println(report.getGrade(student1,"국어"));
//        System.out.println(report.getGrade(student2,"국어"));
//        System.out.println(report.getGrade(student3,"국어"));
//        System.out.println(report.getGrade(student4,"국어"));
//        System.out.println(report.getGrade(student5,"국어"));
        System.out.println(report.result());













    }
}
