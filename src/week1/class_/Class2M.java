package week1.class_;

public class Class2M {
    Class2 class_2 = new Class2("JANE");

    void info(){
        int age = class_2.age;
        String name = class_2.name;
        String sex = class_2.sex;
        String married = "미혼";
        Boolean bmarried = class_2.married;
        int child = class_2.child;
        if(bmarried == true) {
             married = "기혼자";
        }
        System.out.println("이름은 " + class_2.name+ "이고 나이는 " +age +" 입니다. 성별은 "
                +sex+"이며, "+married+"입니다. 자녀는 " + child+"명이 있습니다." );
    }
}
