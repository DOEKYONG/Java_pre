package week3.Inheritance.shopping;

public class GradeDIAMOND extends Grade {

    public GradeDIAMOND(String inName,int price , int inHour) {
        super(inName,price,inHour);
        grade = "DIAMOND";
        bonusRatio = 0.1;
        saleRatio = 0.1;
        parkingPayment = 0;
        hour = inHour;
    }
    @Override
    public void print() {
        String message = name + "님의 지불 금액은 " +getPayment() + "이고 적립포인트는"
                + bonusPayment()+"점입니다.\n"+"주차요금은 " +calParkingPayment()+"원 입니다."+counselor();
        System.out.println(message);
    }

}
