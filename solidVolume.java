class Solid{
      double dim1,dim2;
      Solid(double d1){
          dim1=d1;
      }
      Solid(double d1,double d2){
          dim1=d1;
          dim2=d2;
      }
      void volume(){
          System.out.println("Volume in solid class");
      }
}

class Cube extends Solid{
       Cube(double side){
           super(side);
       }
       void volume(){
           System.out.println("Volume of Cube="+dim1*dim1*dim1);
       }
}
class Sphere extends Solid{
       Sphere(double radius){
          super(radius);
       }
       void volume(){
          System.out.println("Volume of Sphere="+(4.0/3.0)*(3.14)*dim1*dim1*dim1);
       }
}
class Cylinder{
      Cylinder(double radius,double height){
          super(radius,height);
      }
      void volume(){
          System.out.println("Volume of Cylinder="+(3.14)*dim1*dim1*dim2);
      }
}
class Cone{
      Cone(double radius,double height){
          super(radius,height);
      }
      void volume(){
          System.out.println("Volume of Cone="+(1.0/3.0)*(3.14)*dim1*dim1*dim2);
      }
}
class solidVolume{
      public static void main(String args[]){
          Solid s=new Cube(10);
          s.volume();
      }
}