package week1.class_;

public class Class1M {
    Class1 class1 = new Class1();
    // Class1 class2 = new Class1(12, 3); // 인스턴스만사용
     void  sum(){
        int sum = class1.getA()+class1.getB(); // private로 은닉된 정보를 getter 를 통해 조회
         // int sum2 = class2.a + class1.b; => private면 안됨
         // System.out.println("a+b = "+sum2);  인스턴스로만 계산하기
        System.out.println("a+b = "+sum);
     }

    void minus(){
         int minus = class1.getA()- class1.getB();
         System.out.println("a-b = " + minus);
    }

    void mul(){
         int mul = class1.getA()*class1.getB();
        System.out.println("a*b = " + mul);
    }

    void div() {
         int div = class1.getA() /class1.getB();
         System.out.println("a/b = "+div);
    }
}
