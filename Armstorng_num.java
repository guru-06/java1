import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        
        String s = Integer.toString(num); // Convert int to string
        int len = s.length();
        int sum = 0;
        
        while (num > 0) {
            int m = num % 10;           // To find the last digit
            int x = (int)Math.pow(m, len);  // Cast the result of Math.pow() to int
            sum += x;                   // Add to the sum
            num = num / 10;
        }
        
        if (sum == n)
            System.out.print("Yup");
        else
            System.out.print("Nope");
        
        sc.close();  // Close the scanner
    }
}
