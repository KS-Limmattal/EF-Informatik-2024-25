public class Overloading {
    public static int aufrunden(int n){
        return n;
    }

    public static int aufrunden(double d){
        if (d == (int) d){
            return (int) d;
        } else {
            return (int) d + 1;
        }
    }

    public static double aufrunden(double d, int digits){
        d = d * Math.pow(10, digits);
        d = aufrunden(d);
        return d / Math.pow(10, digits);
    }

    public static void main(String[] args) {
        System.out.println(aufrunden(3));
        System.out.println(aufrunden(3.0));
        System.out.println(aufrunden(3.001));
        System.out.println(aufrunden(3.1111111, 2));
    }
}
