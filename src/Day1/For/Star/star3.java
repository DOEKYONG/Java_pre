package Day1.For.Star;

import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        in.close();
        for(int i = 0; i<no; i++) {
            for(int j = no; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

