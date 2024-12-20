import java.util.Arrays;

public class ArrayExercises {
    static double[] invert(double[] input) {
        int n = input.length;
        double[] output = new double[n];
        for (int i = 0; i < n; i++) {
            output[i] = input[n - i - 1];
        }
        return output;
    }

    static int find(int s, int[] words) {
        for (int i = 0; i < words.length; i++) {
            if (s == words[i]) {
                return i;
            }
        }
        return -1;
    }

    static boolean isMagicSquare(int[][] square) {
        int i, j, n = square.length;

        // --- magicSum = first diagonal sum 
        int magicSum = 0;
        for (i = 0; i < n; i++){
            magicSum += square[i][i];
        }

        // check second diagonal
        int secondDiagonalSum = 0;
        for (i = 0; i < n; i++){
            secondDiagonalSum += square[i][n - i - 1];
        }
        if (secondDiagonalSum != magicSum){
            return false;
        }
        
        // --- check rows and columns
        for (i = 0; i < n; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (j = 0; j < n; j++){
                rowSum += square[i][j];
                columnSum += square[j][i];
            }
            if (rowSum != magicSum || columnSum != magicSum){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        double[] a = {5, -2.5, 3, 7, 0.1};
        System.out.println(Arrays.toString(invert(a)));
        System.out.println();

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[] b = {2, 3, 0, -5, 7};
        System.out.println(find(0, b));;
        System.out.println(find(-20, b));
        System.out.println();

        // Test-Code für Teilaufgabe g)
        System.out.println("Aufgabe g)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}

