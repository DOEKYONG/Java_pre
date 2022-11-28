package study.numberBaseball;

import java.util.*;

public class RandomNumber {
    Set  createNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size()<3) {
            int number = randomRange(1,9);
            set.add(number);
        }
        return set;
    }
    List createNumberList(Set<Integer> set) {
        List<Integer> list = new LinkedList<>();
        for(Integer temp : set) {
            list.add(temp);
        }
        System.out.println(list);
        return list;
    }
    int  randomRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    String userNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        String number = scanner.next();
        return number;
    }
    List userNumberList(String number) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i<number.length(); i++) {
            int result =  Character.getNumericValue((number.charAt(i)-0));
            list.add(result);
        }
        return list;
    }

}
