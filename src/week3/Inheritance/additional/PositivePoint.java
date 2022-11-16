package week3.Inheritance.additional;

public class PositivePoint extends  Point{
    public PositivePoint() {
        super();
    }

    public PositivePoint(int x, int y) {
          if (x<0&&y<0) {
            move(0,0);
        }
    }

    @Override
    protected void move(int x, int y) {
        if(x<0||y<0){
            return;
        }
        super.move(x, y);
    }

    @Override
    public String toString(){
        String str = "("+getX()+","+getY()+")의 점";
        return str;
    }

}
