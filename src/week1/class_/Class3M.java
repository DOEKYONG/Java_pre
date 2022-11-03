package week1.class_;

public class Class3M {
    void coffe() {
        Class3 james = new Class3("James",5000,1,"아메리카노");
        Class3 tomas = new Class3("Tomas",10000,2,"라떼");
        int jamesremain = james.money-james.price;
        int tomasremain = tomas.money- tomas.price;
        System.out.println(james.name+"님의 남은돈은 " + jamesremain +" 입니다." +james.cafename+"에서 "+james.menu+"를 마셨습니다.");
        System.out.println(tomas.name+"님의 남은돈은 " + tomasremain +" 입니다." +tomas.cafename+"에서 "+tomas.menu+"를 마셨습니다.");
    }



}
