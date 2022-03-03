class First{
    static final int a=100;
    First(){
       //a=100;
    }
    First(int num){
       //a=num;
    }
}
class staticfinalkey{
    public static void main(String args[]){
         First f1=new First();
         System.out.println(f1.a);
        
         First f2=new First(200);
         System.out.println(f2.a);
    }
}