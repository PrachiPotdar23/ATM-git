class first
{
   public static void main(String args[]){
       int num=Integer.parseInt(args[0]);
       int sum=0;
       int rev=0;
       while(num>0){
         sum=sum+num%10;
         rev=rev*10+num%10;
         num=num/10;
       }
      System.out.println(sum);
      System.out.println(rev);
   }
}  