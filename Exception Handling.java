import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 0 / 0;  // This will throw ArithmeticException
            int arr[] = {1, 2, 3};
            System.out.println(arr[4]);  // This will throw ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error Occurred");
        } 
        finally {
            System.out.println("Run Anyway");
        }
    }
}
