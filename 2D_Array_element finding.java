import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n= sc.nextInt();
	    int arr[][]= new int[m][n];
	    int i=0,j=0;
	    for(i=0;i<m;i++){
	        for(j=0;j<n;j++){
	            arr[i][j]=sc.nextInt();
	        }
	    }
	        int a = sc.nextInt();
	        int count=0;
	        for(i=0;i<m;i++){
	            for(j=0;j<n;j++){
	                if(arr[i][j]==a){
	                   count++;
	                   }
	            }
	        }
	             if(count>0){
	                 System.out.print("Yes");
	             }
	             else
	             System.out.print("No");
	}
}
