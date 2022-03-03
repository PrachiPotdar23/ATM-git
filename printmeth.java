interface MyInter1{
   void meth1();
}

interface MyInter2{
   void meth2();
}

class First{
   void display(){
      System.out.println("this is display");
   }
}
class Myclass extends First implements MyInter1,MyInter2{
   void meth1(){
      System.out.println("this is meth1");
   }
   void meth2(){
      System.out.println("this is meth2");
   }
   void meth3(){
      System.out.println("this is meth3");
   }
}
class printmeth{
   public static void main(String args[]){
       Myclass my=new Myclass();
       my.meth1();
       my.meth2();
       my.meth3();
   }
}