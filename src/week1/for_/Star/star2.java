package week1.for_.Star;

import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        for(int i =0 ; i<no; i++){
            for(int k = 1; k<no-i; k++ ) {
                System.out.print(" ");
            }
            for(int j= 0 ; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
