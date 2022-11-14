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

}
