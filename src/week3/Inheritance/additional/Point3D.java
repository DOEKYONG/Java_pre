package week3.Inheritance.additional;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

//    public Point3D(int z) {
//        this.z = z;
//    }
    void moveUp(){
        z++;
    }
    void moveDown(){
        z--;
    }

    protected void move(int x, int y, int z) {
        super.move(x, y);
        this.z=z;
    }

    @Override
    public String toString() {
        String str = "("+getX()+","+getY()+","+z+")의 점";
        return str;
    }
}
