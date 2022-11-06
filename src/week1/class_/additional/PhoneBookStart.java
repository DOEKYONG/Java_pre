package week1.class_.additional;

import java.util.Scanner;

public class PhoneBookStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("인원 입력");
        int num = scanner.nextInt();
        PhoneBook phoneBook[] = new PhoneBook[num];
        for(int i = 0; i<num; i++){
            System.out.println("이름입력 : ");
            String name = scanner.next();
            System.out.println("전화번호입력 : ");
            String tel = scanner.next();
            phoneBook[i] = new PhoneBook(name,tel);
        }
        System.out.println("저장되었습니당");

        while(true) {
            System.out.println("검색할 이름 입력하세용:");
            String search = scanner.next();
            String tel ="";
            for(int i = 0; i< phoneBook.length; i++) {
                if(phoneBook[i].getName().equals(search)) {
                    tel = phoneBook[i].getTel();
                    break;
                }
            }
            if(!tel.equals("")){
                System.out.println(search+"의 번호 " + tel);
                break;
            }else {
                System.out.println(search+"정보 없음");
            }
        }
    }
}
