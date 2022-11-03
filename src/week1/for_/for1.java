package week1.for_;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        in.close();
        for(int i = 0; i<no; i++) {
            for(int j = 0 ; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }

