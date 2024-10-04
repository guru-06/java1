import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        // Input array
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to store element frequencies
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Populate the HashMap with element frequencies
        for (int i = 0; i < size; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        // Count elements that appear exactly 3 times
        int tripleCount = 0;
        for (int count : countMap.values()) {
            if (count == 3) {
                tripleCount++;
            }
        }

        // Print the result
        System.out.print(tripleCount);
        
        sc.close();
    }
}
