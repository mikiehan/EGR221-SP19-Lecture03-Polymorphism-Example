package pts;

public class Main {
    private static void foo(Object o){
        ((Point)o).translate(10, 20);
    }

    public static void main(String[] args){
        Point p1 = new Point(1,2);
        ((Point3D)p1).translate(100,200);

        foo(new Point(0,0));
        foo(new Point3D(0,0,0));
        foo("hello");
    }
}
