package week3.Inheritance.shopping;

public class GradePLATINUM extends Grade {

    public GradePLATINUM(String inName,int price , int inHour) {
        super(inName,price,inHour);
        grade = "PLATINUM"; //고객 등급
        bonusRatio = 0.05; // 포인트 적립비율
        saleRatio = 0.05; //할인율
        parkingPayment = 1000;
        hour = inHour;
    }
}
