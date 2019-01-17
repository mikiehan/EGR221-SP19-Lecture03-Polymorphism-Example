package mystery;

public class Main {
    public static void main(String[] args){
        Snow var1 = new Sleet(); //var1 is restricted to mystery.Snow but is mystery.Sleet
        var1.method2(); //Actual type mystery.Sleet's method2 is called

        Snow var2 = new Rain(); //var2 is restricted to mystery.Snow but is mystery.Rain
        //var2.method1(); //compile error (var2 is restricted to mystery.Snow and mystery.Snow doens't have method1)

        Snow var3 = new Rain(); //var3 is restricted to mystery.Snow, but is mystery.Rain
        ((Rain)var3).method1(); //casting down is ok for static type. No compile error
                                // No change in dynamic type. No run-time error either
        // var3 is now restricted to mystery.Rain and also is mystery.Rain. mystery.Rain's method1 is called

        Snow var4 = new Rain(); //var4 is restricted to mystery.Snow, but is mystery.Rain
        var4.method2(); //Actual type mystery.Rain's method2 is called

        Snow var5 = new Rain(); //var5 is restricted to mystery.Snow, but is mystery.Rain
        ((Sleet)var5).method2(); //casting down is ok for static type. No compile error.
        //         mystery.Rain to mystery.Sleet is invalid change in dynamic type. ClassCastException!

        Snow var6 = new Fog(); //var6 is restricted to mystery.Snow, but is mystery.Fog
        ((Sleet)var6).method2(); //casting down is ok for static type. No compile time error.
        //mystery.Fog to mystery.Sleet casting up is ok for dynamic type. mystery.Fog's method2 is called.

        Snow var7 = new Sleet(); //var7 is restricted to mystery.Snow, but is mystery.Sleet
        ((Fog)var7).method1(); //casting down is ok for static type. No compile time error.
        //mystery.Sleet to mystery.Fog casting down is invalid change in dynamic type.

        Snow var8 = new Sleet();
        System.out.println(((Object)var8).getClass());

    }
}
