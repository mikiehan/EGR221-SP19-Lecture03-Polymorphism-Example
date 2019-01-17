package pts;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dX, int dY){
        this.x += dX;
        this.y += dY;
    }
}
