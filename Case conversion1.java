import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n = sc.nextInt();
	   int k=0;
	   char []arr = new char[n];
	   
	   for(int i=0;i<n;i++){
	      arr[i]=sc.next().charAt(0);
	   }
	   for(int i=0;i<n;i++)
	   {
	     k=(int)arr[i];
	       System.out.println((char)(k^32));
	      }
	  
	   }

}
