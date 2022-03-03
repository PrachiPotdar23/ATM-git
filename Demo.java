import java.io.*;

class Demo{
   public static void main(String args[]) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter data to read. Enter 'S' to stop");
      int i;
      char ch='';
      while(ch!='S'){
         i=br.read();
         ch=(char)i;
         if(ch!='S')System.out.print(ch);
      }
      
   }
 }