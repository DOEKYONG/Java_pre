package week1.for_.Star;
import java.util.Scanner;
public class star7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int count =0;
        for(int i =1; i<=no; i++) {
            for(int j = 1; j<=no-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i*2-1; k++) {
                System.out.print("*");
                count = k;
            }
            System.out.println();
        }
        for (int i = 1 ; i<=count/2; i++) {
            //System.out.println("카운트  : "+count);
            for(int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k = count-1; k>i*2-1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

