import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int start = sc.nextInt();
	    int end = sc.nextInt();
	    for(int i=start;i<=end;i++){
	        System.out.print((i%2!=0)?i:" ");
	    }
	}
}
