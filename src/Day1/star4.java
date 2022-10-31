package Day1;

import java.util.Scanner;

public class star4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        for(int i =0 ; i<no; i++){
            for(int k = no; k>no-i; k-- ) {
                System.out.print(" ");
            }
            for(int j= no ; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
