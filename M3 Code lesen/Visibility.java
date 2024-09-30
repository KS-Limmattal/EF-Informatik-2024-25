public class Visibility {
    static int s;
    
    static int y(int y) {
        int x = 1; /* 1 */
        if (y > 0) {
            int temp = x;
            x = y;
            y = temp;
        }
        s = 5;
        return x + y;
    }
    
    public static void main(String[] args) {
        int x = 2; /* 2 */
        int y = y(x); /* 3 */
        s = 4;
        y(y); /* 4 */
    }
}