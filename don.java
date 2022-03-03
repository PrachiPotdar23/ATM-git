class box{
    double width,height,length;
    box(double w,double h,double l){
        width=w;
        height=h;
        length=l;
    }
}
class Myclass{
    box meth(box b){
      box c=new box(b.width*2,b.height*2,b.length*2);
      return c;
      
    }
}
class don{
   public static void main(String[] args){
      box b1=new box(10,20,30);
      Myclass m=new Myclass();
      box b2=m.meth(b1);
      System.out.println("width="+ b1.width+" "+"height="+b1.height+" "+"length="+" "+b1.length);
      System.out.println("width="+ b2.width+" "+"height="+b2.height+" "+"length="+" "+b2.length);
   }
}