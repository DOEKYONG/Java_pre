package week3.Inheritance.shopping;

import week2.file.Grade;

public abstract  class Member  {
    protected String name; // 회원이름
    protected String grade; // 회원등급
    protected double bonusRatio; // 적립
    protected int bonusPoint; // 적립금  ==> 쇼핑금액*적립금액
    protected int payment; // 쇼핑금액
    protected int parkingPayment; // 주차 금액
    protected double saleRatio; //할인율
    protected int hour; // 시간

    public Member(String inName, int price , int inHour) {
        name = inName;
        grade = "RED";
        bonusRatio = 0.01;
        parkingPayment = 3000;
        saleRatio = 0;
        payment = price;
        hour = inHour;
    }

    public Member() {}
    //public void print() {}

      public abstract void print();

}
