class First{
    double width,height,length;
    First(double w,double h,double l){
       width=w;
       heigth=h;
       length=l;
    }
    First(double side){
       width=height=length=side;
    }
    First(){
        width=height=length=1;
    }
    void volume(){
        System.out.println("volume="+width*height*length);
    } 
}
class constructoroverloading{
    public static void main(String args[]){
        First f;
        f.First(10,11,12);
        f.volume();
       
        f.First(10);
        f.volume();
   
        f.First();
        f.volume(); 
   }
}