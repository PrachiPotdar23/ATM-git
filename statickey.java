class First{
    static int a=100;
    First(){
        System.out.println("this is constructor in First class");
    }
    static void meth(){
        System.out.println("this is static method");
    }
    static
    {
        System.out.println("this is static block");
    }
    {
        System.out.println("this is instance block");
    }

}
class statickey{
    static
    {
        System.out.println("this static block in main class");
    }
    {
        System.out.println("this is instance block in main class");
    }
    public static void main(String args[]){
        System.out.println("hello");
        System.out.println(First.a);
        First.meth();
        
        First f1=new First();
        First f2=new First();

        System.out.println(f1.a);
        System.out.println(f2.a);
        f1.a=200;
        System.out.println(f2.a);
        System.out.println(First.a);
   }
}