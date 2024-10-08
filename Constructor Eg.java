import java.util.*;
public class Main{
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        int value = sc.nextInt();
        library lib=new library(book,value);
        lib.display();
        
    }
    static class library{
         String book;
         int value;
         
         public library(String book,int value){
             this.book = book;
             this.value = value;
         }
         
         public void display(){
             String str="";
             if(value==0)
             str = "borrowed.";
             else if(value==1)
             str = "returned.";
             System.out.print("The book "+book+" is "+str);
         
         }
        
    }
}
