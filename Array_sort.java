import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input sorting range (start and end)
        System.out.println("Enter the start and end index for sorting:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // Bounds checking to avoid out-of-bounds issues
        if (start >= 0 && end <= n && start < end) {
            Arrays.sort(arr, start, end); // Sort part of the array
        } else {
            System.out.println("Invalid indices for sorting!");
        }
        
        // Output the sorted array
        System.out.println("ARRAY= " + Arrays.toString(arr));
        
        sc.close();
    }
}
