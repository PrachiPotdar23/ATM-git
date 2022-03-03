class InvalidLengthException {
      public String toString(){
         return "length of string is less than 3 or greater than 10";
      }
}
class ConvetStr{
      char str[];
      void upstr(str){
         if(str.length()<3 || str.length()>10){
             InvalidLengthException i=new InvalidLengthException();
             throw i;
         }
         System.out.println(str.toUppercase());
      }
}
class PrintUpstr{
     public static void main(String args[]){
         ConvertStr c=new ConvertStr();
         try{
            c.upstr(args[0]);
         }
         catch(InvalidLength in){
            System.out.println(in);
         }
     }
}