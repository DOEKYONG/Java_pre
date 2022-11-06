package week1.class_.additional;

public class Circle {
    private double x, y;
    private int radius;
    private Circle[] circle;


    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle[] circle) {
        this.circle = circle;
    }

    public int getRadius() {
        return radius;
    }

    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }

//     4-1 방법 사용시 사용
//    public void max() {
//        System.out.println("가장 면적이 큰 원은"+"("+x+","+y+")"+radius);
//    }

    // 4-2 방법 사용시 사용
    public void max2(Circle[] circles) {
        int maxradius = circles[0].getRadius(); // 최댓값구하기
        int index = 0; // Circle객체 식별
        for(int i = 1;  i< circles.length; i++) {
            if (circles[i].getRadius() > maxradius) {
                maxradius = circles[i].getRadius();
                index = i;
            }
        }
        x = circles[index].x;
        y = circles[index].y;
        radius = circles[index].radius;
        System.out.println("가장 면적이 큰 원은"+"("+x+","+y+")"+radius);
    }

}
