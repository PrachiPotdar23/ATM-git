class MyThread implements Runnable{
    Thread t;
    MyThread(String tname){
       t=new Thread(this,tname);
       t.start();
    }
    public void run(){
        for(int i=1;i<=4;i++){
           System.out.println(t.getName()+":"+i);
           try{
              Thread.sleep(1000);
           } 
           catch(InterruptedException ie){}
        }
    }
}
class Demo6{
   public static void main(String args[]){
       MyThread m1=new MyThread("one");
       MyThread m2=new MyThread("two");
       MyThread m3=new MyThread("three");
 
       System.out.println(m1.t.isAlive());
       System.out.println(m2.t.isAlive());
       System.out.println(m3.t.isAlive());
     
       try{
          m1.t.join();
          m2.t.join();
          m3.t.join();
       }
       catch(InterruptedException ie){}
       System.out.println(m1.t.isAlive());
       System.out.println(m2.t.isAlive());
       System.out.println(m3.t.isAlive());
   }
}