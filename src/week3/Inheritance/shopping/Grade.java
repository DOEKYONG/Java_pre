package week3.Inheritance.shopping;

  class  Grade extends Member {
    public Grade(String inName,int price,int inHour) {
        super(inName,price,inHour);
    }
    public int calParkingPayment() {
        parkingPayment = parkingPayment*hour;
        return parkingPayment;
    }
    public int bonusPayment(){
        bonusPoint = (int)(payment*bonusRatio);
        return bonusPoint;
    }
    public  int salePoint(){
        int salePrice = (int)(payment*saleRatio);
        return salePrice;
    }
    public void counselor () {
        System.out.println("상담원 호출");
    }
    public  int getPayment(){
        int fintalPayment = payment-salePoint();
        return fintalPayment;
    }
    public void print() {
        String message = name + "님의 지불 금액은 " +getPayment() + "이고 적립포인트는"
                + bonusPayment()+"점입니다.\n"+"주차요금은 " +calParkingPayment()+"원 입니다.";
        System.out.println(message);
    }

}
