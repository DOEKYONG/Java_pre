package week1.if_;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c  = in.nextInt();
        int min = b+c;
        int h =   a += min/60;
        in.close();
        if(b+c<60){
            b += c;
        } else if(min==60 && min%60 == 0 ){
            h= a;
            b = min-(min/60)*60;

        } else if(min>60 ) {
            b = min-(min/60)*60;
        }
        if(a>=24) {
           h = (a-24);
        }
        System.out.println(h+" "+b);
    }
}
