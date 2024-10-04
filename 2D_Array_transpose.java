import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Initialize and input the original matrix
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Initialize the transpose matrix
        int[][] arr1 = new int[b][a];
        
        // Compute the transpose
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[j][i] = arr[i][j];
            }
        }
        
        // Print the transposed matrix
        for (int[] row : arr1) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
