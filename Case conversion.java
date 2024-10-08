import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n = sc.nextInt();
	   int c=0;
	   int k=0;
	   char []arr = new char[n];
	   
	   for(int i=0;i<n;i++){
	      arr[i]=sc.next().charAt(0);
	   }
	   for(int i=0;i<n;i++)
	   {
	       c = arr[i];
	     k=(int)c;
	     k=k-32;  // k=k+32 for upper to lower.
	       System.out.print((char)k);
	      }
	  
	   }

}
