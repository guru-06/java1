import java.util.*;
public class Main
{
	public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int sum=0;
     int n=sc.nextInt();
     int m=sc.nextInt();
     char arr[]= new char[n];
     char ch[] = {'a','e','i','o','u','A','E','I','O','U'};
     for(int i=0;i<n;i++){
         arr[i]=sc.next().charAt(0);
         for(int j=0;j<ch.length;j++){
             if(arr[i]==ch[j]){
                char b=ch[j];
                  sum+=(int)b;
             }
         }
     }
             if(sum%m==0)
             System.out.print("True");
             else 
             System.out.print("False");
	}
}
