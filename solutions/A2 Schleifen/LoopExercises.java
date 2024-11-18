public class LoopExercises {

    public static int crossSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void primeFactorisation(int n) {
        System.out.print("Prime factorisation of " + n + " = ");
        int factor = 2;
        while (n != 1) {
            if (n % factor == 0) {
                System.out.print(factor);
                n = n / factor;
                if (n != 1) {
                    System.out.print(" * ");
                }
            } else {
                factor++;
            }
        }
        System.out.println();
    }

    public static int numberOfOnes(int n) {
        int numberOfOnes = 0;
        while (n != 0) {
            if (n % 10 == 1){
                numberOfOnes++;
            }
            n = n / 10;
        }
        return numberOfOnes;
    }

    public static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++){
            product = product * i;
        }
        return product;
    }

    public static void tryAll(){
        for (int l = 0; l < 10; l++){
            for (int o = 0; o < 10; o++){
                for (int t = 0; t < 10; t++){
                    for (int x = 0; x < 10; x++){
                        if (100 * x + 10 * o + l + 100 * l + 11 * x == 101 * t + 10 * l){
                            System.out.print("" + x + o + l + " + " + l + x + x + " = " + t + l + t);
                            if (l != o && l != t && l != x && o != t && o != x && t != x){
                                System.out.print(" (alle unterschiedlich)");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

    public static double pi(int digits) {  
        // calculate precision as a floating point number
        double precision = Math.pow(0.1, digits) / 4;

        // approximating 1/4 Pi
        double sum = 0;
        double summand = 1;
        long i = 1;
        int sign = 1;
        while (Math.abs(summand) > precision) {
              summand = sign * 1. / i;
              sum = sum + summand;
              sign = -sign;
              i = i + 2;
        }

        return 4 * sum;
    }

    public static void main(String[] args) {
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        int n = 121456;
        System.out.println("Cross sum of " + n + " is " + crossSum(n));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        primeFactorisation(12);
        primeFactorisation(144);
        System.out.println();

        // Test-Code für Teilaufgabe x)
        System.out.println("Aufgabe x)");
        System.out.println(n + " contains " + numberOfOnes(n) + " Ones.");
        System.out.println();

        // Test-Code für Teilaufgabe y)
        System.out.println("Aufgabe y)");
        for (n = 0; n < 10; n++){
            System.out.println(n + "! = " + factorial(n));
        }
        System.out.println();

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        tryAll();
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (n = 0; n < 12; n++){
        System.out.println("Pi approximated to " + n + " digits with pi() is " +
        pi(n));
        }
        System.out.println();
    }
}