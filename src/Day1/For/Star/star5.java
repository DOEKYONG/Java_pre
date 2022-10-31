package Day1.For.Star;

import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        for(int i =1; i<=no; i++) {
            for(int j = 1; j<=no-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
