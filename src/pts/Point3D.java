package pts;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void translate(int dX, int dY) {
        super.translate(dX*2, dY*2);
    }
}
