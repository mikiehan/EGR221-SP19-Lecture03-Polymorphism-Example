package mystery;

public class Sleet extends Snow {
    public void method2(){
        System.out.println("Sleet 2");
        super.method2();
        this.method3();
    }
    public void method3(){
        System.out.println("Sleet 3");
    }
}
