package Day1.IF;

import java.util.Scanner;

public class if7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c  = in.nextInt();
        if(a==b && b==c){
            System.out.println(10000+a*1000);
        }
       else if(a==b || a==c || b==c) {
            if(a==b) {
                System.out.println(1000+a*100);
            }
            if(a==c) {
                System.out.println(1000+c*100);
            }
            if(b==c) {
                System.out.println(1000+b*100);
            }
        }
        else if(a!=b && b!=c && a!=c ) {
            if(a>b && a>c ) {
                System.out.println(a*100);
            }
            if(b>a && b>c ) {
                System.out.println(b*100);
            }
            if(c>a && c>b ) {
                System.out.println(c*100);
            }
        }

    }
}
