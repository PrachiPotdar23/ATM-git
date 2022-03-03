import java.util.Scanner;
class BitwisIthBit{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=sc.nextInt();
      if((n & (1<<n-1))==i){
       System.out.println("1");
      }
      else{
       System.out.println("0");
      }
   }
}