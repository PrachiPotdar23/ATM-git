class Except{
   public static void main(String args[]){
      try{	
          int m=100,n=Integer.parseInt(args[0]);
          int k=m/n;
          System.out.println("k="+k);
      }
      catch(ArithmeticException ae){
          System.out.println("can't divide by zero");
      }
      catch(ArrayIndexOutOfBoundsException ai){
          System.out.println("invalid array index!");
      }
      catch(NumberFormatException ne){
          System.out.println("invalid input!");
      }
      System.out.println("hello!");
      
   }
}