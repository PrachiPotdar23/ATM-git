class Box1{
     double width,height,length;
     Box1(double w,double h,double l){
        width=w;
        height=h;
        length=l;
     }
}
class Myclass{
    void volume(Box1 b){
        System.out.println(b.width*b.height*b.length);
    }
}
class Exceptnullpt{
    public static void main(String args[]){
        try{
           Box1 c=null;
           new Myclass().volume(c);
        }
        catch(NullPointerException n){
           System.out.println("pointer denotes null here!");
        }
    }
}
