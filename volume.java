class box{
     double width,height,length;
}
class volume{
     public static void main(String args[]){
         box b=new box();
         b.width=10;
         b.height=11;
         b.length=12;
         System.out.println("Volume="+b.width*b.height*b.length);
     }
}
          