public class Problems {

    static void dont() {
        panic();
    }

    static int panic() {
        dont();
        return 0;
    }

    static void marvin(int n) {
        System.out.println(n * n * n * n);
    }

    static void fortytwo(int six) {
        seven = 6;
        System.out.println(seven * six);
    }

    static void fordPrefect(int towel) {
        System.out.println(4 / towel);
    }

    public static void main(String[] args) {
       dont();
       marvin(100000000);
       fortytwo(7.);
       fordPrefect(0);
    }
}
