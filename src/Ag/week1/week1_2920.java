package Ag.week1;
import java.util.Arrays;
import java.util.Scanner;
public class week1_2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr ={1,2,3,4,5,6,7,8};
        Integer[] arrd = {8,7,6,5,4,3,2,1};
        Integer[] arr2 = new Integer[arr.length];
        for(int i = 0; i<arr2.length; i++ ) {
            arr2[i] = in.nextInt();
        }
        if(Arrays.equals(arr,arr2)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr2,arrd)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        //다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.

    }
}
