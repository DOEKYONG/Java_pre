package week1.class_;

public class Class3 {
    String name;
    int money;
    int cafenum;
    String cafename;
    String menu;
    int price;


    public Class3(String name, int money, int cafenum , String menu) {
        this.name = name;
        this.money = money;
        this.cafenum = cafenum;
        this.menu = menu;
        this.cafename = getCafename(); // 값이 없으면 null 오류 발생
        this.price = getPrice(); // 값이 없을때 deafult 값 0이어서 안해줘도 오류대신 0 이 들어가서 실행
    }

    public String getCafename() {
        if(cafenum == 1) {
            cafename = "별다방";
        } else if (cafenum==2) {
            cafename ="콩다방";
        } else{
            cafename ="xxxx";
        }
        return cafename;
    }

    public int getPrice() {
        if(cafename.equals("별다방") && menu.equals("아메리카노")){
            price = 4000;
        } else if(cafename.equals("콩다방") && menu.equals("라떼")) {
            price = 5000;
        }
        return price;
    }
}
