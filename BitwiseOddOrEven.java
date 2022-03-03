import java.util.Scanner;
class BitwiseOddOrEven{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if((n & 1)==1){
       System.out.println("No. is Odd");
      }
      else{
       System.out.println("No. is Even");
      }
   }
}