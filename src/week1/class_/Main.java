package week1.class_;

public class Main {
    public static void main(String[] args) {
    Class1M class1M = new Class1M();
    Class2M class2M = new Class2M();
    Class3M class3M = new Class3M();

    // 1 사칙연산
    System.out.println("----------------- 1 사칙연산 ---------------");
        class1M.sum();
        class1M.minus();
        class1M.mul();
        class1M.div();
    System.out.println();

    // 2 정보
    System.out.println("----------------- 2 정보 ---------------");
        class2M.info();
    System.out.println();

    // 3 커피
    System.out.println("----------------- 3 커피 ---------------");
        class3M.coffe();
    System.out.println();

    // 4 Mydate
    System.out.println("---------------- 4 Mydate -------------");

    MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
    MyDate date2 = new MyDate(31, 10, 2006);
        System.out.println(date2.isValid());
        /*
            아래 코드 에러,수정하려면 setter 통해서 접근
            date1.day =10;
    	    date1.month = 3;
    	    date1.year = 2020;
         */

    }

}
