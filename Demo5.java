class ThreadLogic1 implements Runnable{
   Thread t1;
   Thread obj;
   ThreadLogic1(String tname){
     t1=new Thread(this,tname);
     t1.start();
   }
   public void run(){
     for(int i=1;i<=10;i++){
        System.out.println(t1.getName()+" : "+ i);
        try{
           Thread.sleep(1000);
           if(i==5){
              obj.join();
           }
        }
        catch(InterruptedException ie){}
     }
   }
}

class ThreadLogic2 implements Runnable{
   Thread t2;
   Thread obj;
   ThreadLogic2(String tname,Thread obj){
     this.obj=obj;
     t2=new Thread(this,tname);
     t2.start();
   }
   public void run(){
     for(int i=11;i<=20;i++){
        System.out.println(t2.getName()+" : " +i);
        try{
           Thread.sleep(1000);
           if(i==15){
              obj.join();
           }
        }
        catch(InterruptedException ie){}
     }
   }
}
class ThreadLogic3 implements Runnable{
   Thread t3;
   Thread obj;
   ThreadLogic3(String tname,Thread obj){
     this.obj=obj;
     t3=new Thread(this,tname);
     t3.start();
   }
   public void run(){
     for(int i=21;i<=30;i++){
        System.out.println(t3.getName()+" : " +i);
        try{
           Thread.sleep(1000);
           if(i==25){
              obj.join();
           }
        }
        catch(InterruptedException ie){}
     }
   }
}
class Demo5{
    public static void main(String args[]){
        ThreadLogic1 m1=new ThreadLogic1("One");
        ThreadLogic2 m2=new ThreadLogic2("Two",m1.t1);
        ThreadLogic3 m3=new ThreadLogic3("Three",m2.t2);
        m1.obj=m3.t3;
    }
}