package week1.if_;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        in.close();
        if(m>=45) {
            m -= 45;
        } else if(m<45) {
            if(h!=0) {
                h -= 1;
            } else if(h==0) {
                h= 23;
            }
            m = 60 - (45-m);
        }
        System.out.println(h+" "+m);
    }
}
