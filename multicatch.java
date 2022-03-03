class multicatch{
    public static void main(String args[]){
       try{
           System.out.println("start of outer try");
           try{
                System.out.println("start of inner try");
                int m=100,n=Integer.parseInt(args[0]);
                int k=m/n;
                System.out.println("k="+k);
                System.out.println("end of inner try");
           }
          catch(ArithmeticException ae){
               System.out.println("can't divide by zero");
           }
      System.out.println("end of outer try");
      }
      catch(ArrayIndexOutOfBoundsException a){
            System.out.println("invalid index");
      }
    }
}