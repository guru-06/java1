import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int size = sc.nextInt();
        
        // Initialize the array based on the size input
        int[] count = new int[size];
        
        // Fill the array with elements
        for (int i = 0; i < size; i++) {
            count[i] = sc.nextInt();
        }
        
        // Input the number to be inserted and the index where it will be inserted
        int num = sc.nextInt();
        int index = sc.nextInt();
        
        // Check if index is within valid range
        if (index >= 0 && index < size) {
            // Insert the number at the specified index
            count[index] = num;
        } else {
            System.out.println("Invalid index");
            return;
        }

        // Print the updated array
        for (int i = 0; i < size; i++) {
            System.out.print(count[i] + " ");
        }
        
        sc.close();
    }
}
