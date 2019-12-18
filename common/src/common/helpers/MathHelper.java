package common.helpers;

public class MathHelper {

    public static final double E = 2.71;
    public static final double PI = 3.14;

    public static int square(int val){
        return val * val;
    }

    public static int cube(int val){return val * val * val;}

    public static double circumference(int rad){ return 2 * PI * rad; }

    public static double half(double val) { return val / 2;}
}
