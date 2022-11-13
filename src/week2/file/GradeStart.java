package week2.file;


import java.util.Scanner;

public class GradeStart {
    public static void main(String[] args) {

        GradeSchool gradeSchool = GradeSchool.getSchool();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.조회 2.전체조회 3.추가 4.수정 ");
            int menu = scanner.nextInt();
            if(menu ==1 ) {
                System.out.println("학번을 입력하세요 :");
                int studentNum = scanner.nextInt();
                gradeSchool.getGrade().print(studentNum);
                continue;
            }
            if(menu ==2 ){
                gradeSchool.getGrade().showAll();
            }
            if(menu == 3) {
                System.out.print("이름을 입력하세요 : ");
                String name = scanner.next();
                System.out.print("전공을 입력하세요 : ");
                String major = scanner.next();
                System.out.print("국어점수를 입력하세요 : ");
                int korean  = scanner.nextInt();
                System.out.print("수학점수를 입력하세요 : ");
                int math  = scanner.nextInt();
                System.out.print("영어점수를 입력하세요 : ");
                int english  = scanner.nextInt();
               gradeSchool.getGrade().write(name,major,korean,math,english);

            }

            if(menu == 4 ){
                System.out.print("학번을 입력하세요 : ");
                int inNum = scanner.nextInt();
                System.out.print("수정할 과목을 입력하세요 : ");
                String inSubject = scanner.next();
                System.out.print("수정할 점수를 입력하세요 : ");
                int score = scanner.nextInt();
               gradeSchool.getGrade().update(inNum,inSubject,score);

                continue;
            }
            if(menu ==5 ){
              break;
            }
        }

    }
}
