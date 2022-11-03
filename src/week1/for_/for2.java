package week1.for_;

import java.util.*;
public class for2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int sum = 0;
        in.nextLine(); // 입력버퍼 비워주기
        String str = in.nextLine();
        for(int i=0; i<no; i++) {
            System.out.println("아스키 코드 : "+str.charAt(i));
            sum += str.charAt(i)-48; // '0'
        }

//        int no2 = str.charAt(0); // int 로 선언시 아스키코드의 값 53이 됨
//        System.out.println(no2+1); // 아스키 코드 53+1

       System.out.println(sum);
    }
}
