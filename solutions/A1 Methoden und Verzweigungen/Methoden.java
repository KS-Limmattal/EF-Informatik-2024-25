public class Methoden {

    public static int round(int n) {
        return (n + 50) / 100 * 100;
    }

    public static void hours(int s) {
        System.out.println((s / 3600) + ":" + (s % 3600 / 60) + ":" + (s % 60));
    }

    public static void sort(int a, int b, int c) {
        if (b < a && c < b) {
            System.out.println(c + " " + b + " " + a);
        } else if (a < b && c < a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b < c && a < b) {
            System.out.println(a + " " + b + " " + c);
        } else if (c < b && a < c) {
            System.out.println(a + " " + c + " " + b);
        } else if (a < c && b < a) {
            System.out.println(b + " " + a + " " + c);
        } else if (c < a && b < c) {
            System.out.println(b + " " + c + " " + a);
        } else if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b == c && a < b) {
            System.out.println(a + " " + b + " " + c);
        }
    }

    // int als Ausgabetyp machte keinen Sinn, korrigiert zu double
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dy * dy + dx * dx);
    }

    public static void main(String[] args) {
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(round(149));
        System.out.println(round(150));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        hours(0);
        hours(59);
        hours(60);
        hours(100);
        hours(3600);
        hours(4000);
        System.out.println();

        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        // Test-Code ent-kommentieren, sobald die Funktion programmiert ist
        sort(1, 2, 3);
        sort(1, 3, 2);
        sort(2, 1, 3);
        sort(2, 3, 1);
        sort(3, 1, 2);
        sort(3, 2, 1);
        sort(1, 3, 3);
        sort(-1, -1, -1);
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        System.out.println(distance(0, 0, 0, 0));
        System.out.println(distance(0, 10, 0, 0));
        System.out.println(distance(0, 0, 0, 10));
        System.out.println(distance(10, 10, 0, 0));
        System.out.println(distance(0, 0, 10, 10));
    }
}