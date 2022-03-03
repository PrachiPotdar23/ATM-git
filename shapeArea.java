class Figure{
     double dim1,dim2;

     Figure(double d1){
         dim1=d1;
     }
     Figure(double d1,double d2){
         dim1=d1;
         dim2=d2;
     }
     void Area(){
         System.out.println("Area in Figure class");
     }
}

class Rectangle extends Figure{
     Rectangle(double width,double length){
          super(width,length);
     }
     
     void Area(){
          System.out.println("Area of Rectangle="+dim1*dim2);
     }
}
class Triangle extends Figure{
     Triangle(double base,double height){
          super(base,height);
     }
     void Area(){
        System.out.println("Area of Triangle="+0.5*dim1*dim2);
     }
}

class Myclass{
     void myArea(Figure F){
        F.Area();
     }
}

class shapeArea{
    public static void main(String args[]){
        Rectangle r=new Rectangle(10,20);
        Triangle t=new Triangle(10,20);
        Myclass m=new Myclass();
        m.myArea(r);
        m.myArea(t);
    }
}