import java.util.Scanner;

public class find_max_in_two_dimensional_array {
    static int rowNumber;
    static int columnNumber;
    static Scanner scanner = new Scanner(System.in);
    static float[][] matrix;
    static float[][] testMatrix = new float[5][5];

    public static void main(String[] args) {
        System.out.println("Input number of Row:");
        rowNumber = scanner.nextInt();
        System.out.println("Input number of Column");
        columnNumber = scanner.nextInt();
        matrix = new float[rowNumber][columnNumber];
        inputToMatrix(matrix);
        showMatrix(matrix);
        System.out.println("max="+findMax(matrix));
    }

    public static void showMatrix(float[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void inputToMatrix(float[][] matrix) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.println("matrix[" + i + "]" + "[" + j + "]= ");
                matrix[i][j] = scanner.nextFloat();
            }
        }
    }

    public static float findMax(float[][] matrix) {
        float max = matrix[0][0];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if (max < matrix[i][j]) max = matrix[i][j];
            }
        }
        return max;
    }
}
