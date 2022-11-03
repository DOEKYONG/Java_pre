package week1.class_;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 메소드
    String isValid() {
        if(day>31 || month>12) return year+"년 "+month+"월 "+day+"일은 유효하지 않은 날짜입니다.";
        if((year%4 ==0 && year%100 !=0) || year%400 == 0 ) {
            if(month == 2 && day>29 ) {
                return year+"년 "+month+"월 "+day+"일은 유효하지 않은 날짜입니다.";
            }else {
                return year+"년 "+month+"월 "+day+"일은 유효한 날짜 입니다.";
            }
        }
        return year+"년 "+month+"월 "+day+"일은 유효한 날짜 입니다.";
    }
}
