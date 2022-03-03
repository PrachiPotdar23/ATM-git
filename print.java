abstract class First{
      abstract void meth();
}
class Second extends First{
      void meth(){
         System.out.println("method in Second class");
      }
}
class Third extends First{
      void meth(){
         System.out.println("method in Third class");
      }
}
class Myclass{
      First Mymeth(){
         return new Second();
      }
}
class print{
     public static void main(String args[]){
         Myclass m=new Myclass();
         First f;
         f=m.Mymeth();
         f.meth();
     }
}
     