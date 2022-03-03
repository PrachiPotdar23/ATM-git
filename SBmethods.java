import java.util.Arrays;
public class SBmethods{
  public static void main(String args[]){
     String name="Prachi Potdar";
     System.out.println(Arrays.toString(name.toCharArray()));
     System.out.println(name.toLowerCase());
     System.out.println(name);
     System.out.println(name.indexOf('a'));
     System.out.println("   Prachi  ".strip());
     System.out.println(Arrays.toString(name.split(" ")));
  }
}