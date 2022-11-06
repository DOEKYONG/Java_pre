package week1.class_.additional;

public class Rectangle {

    // 필드
    private int x;
    private int y;
    private int width;
    private int height;

    // 생성자
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 메소드
    public  int square() {
        return width*height;
    }

    void show(){
        System.out.println("("+x+","+y+")에서 크기가"+width+"x"+height+"인 사각형");
    }

    public boolean contains(Rectangle r) {
        int squre = r.height+r.width;
        if(r.height+r.width+r.x+r.y <22){
            return true;
        }
        else return false;
    }


}
