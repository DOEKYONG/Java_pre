package week3.Inheritance.additional;

public class ColorPoint extends Point {
String color;
    public ColorPoint(int x, int y, String inColor) {
        super(x,y);
          color = inColor;

    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public ColorPoint() {
        super();
        color = "BLACK";
        move(0,0);
    }

    void setXY(int x , int y){
        move(x,y);
    }
    void setColor(String inColor) {
        color = inColor;
    }

    public String toString(){
        String str =color+"색의"+" ("+getX()+","+getY()+")의 점";
        return str;
    }






}
