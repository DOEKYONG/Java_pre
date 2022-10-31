package Day1;

import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("코드스쿼드");
        Scanner in = new Scanner(System.in);
        System.out.println("숫자입력 a :");
        short a = in.nextShort();
        System.out.println("숫자입력 b :");
        short b = in.nextShort();
        if(a<b) {
            System.out.println("<");
        } else if(a>b){
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}
