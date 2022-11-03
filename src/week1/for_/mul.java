package week1.for_;
import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세요( 0 입력시 1~9단 출력 ) : ");
        int no = in.nextInt();
        in.close();
        if(no==0) {
            all();
        } else {
            for(int i = 1;  i<10; i++) {
                System.out.println(no+"X"+i +"="+i*no);
            }
        }
    }
    public static void all() {
        for (int i= 1 ; i<10 ; i++) {
            System.out.print(i+"단\t\t");
        }
        System.out.println();
        for (int i= 1 ; i<10 ; i++) {
            //System.out.println();
            for(int j = 1 ; j<10 ; j ++) {
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}

