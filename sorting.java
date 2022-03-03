import java.util.*;

class Wrestler implements Comparable<Wrestler>
{
   private String wname;
   private int weight;

   public Wrestler(String wname,int weight){
     this.wname=wname;
     this.weight=weight;
   }

   public String getWname(){
      return wname;
   }
   public int getWeight(){
      return weight;
   }

   public String toString(){
      return wname+" "+weight;
   }

   public int compareTo(Wrestler obj){
      return this.getWname().compareTo(obj.getWname());
   }
}

class sorting{
   public static void main(String args[]){
      ArrayList<Wrestler> list=new ArrayList<Wrestler>();

      list.add(new Wrestler("Zaheer",120));
      list.add(new Wrestler("Anil",110));
      list.add(new Wrestler("Uma",80));
      list.add(new Wrestler("Saket",90));

      System.out.println(list);
      
      Collections.sort(list);
      System.out.println(list);
   }
}