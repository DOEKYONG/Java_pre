package week1.class_.additional;

import java.util.Scanner;

public class CircleManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circles[] = new Circle[3];// 3개의 Circle 배열 선언
        for (int i = 0; i < circles.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();// x값 읽기.
            double y = scanner.nextDouble();// y값 읽기.
           int radius = scanner.nextInt(); // radius값 읽기.
            circles[i] = new Circle(x,y,radius);// Circle 객체 생성
        }
        for (int i = 0; i < circles.length; i++){
           circles[i].show();
        }// 출력 : 3번 문제

        // 4번문제 면적 가장 큰거 출력
/////////////////////////////////////////////////////////////////////
        // 1. 메인에서 메소드처리
//        int maxradius = circles[0].getRadius(); // 최댓값구하기
//        int index = 0; // Circle객체 식별
//        for(int i = 1;  i< circles.length; i++) {
//            if (circles[i].getRadius() > maxradius) {
//                maxradius = circles[i].getRadius();
//                index = i;
//            }
//        }
//        circles[index].max();
/////////////////////////////////////////////////////////////////////
//      2. Circle에서 메소드처리
        Circle circle2 = new Circle(circles);
        circle2.max2(circles);
        scanner.close();
    }
}
