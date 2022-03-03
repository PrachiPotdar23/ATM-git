class ThreadLogic1 implements Runnable{
      public void run(){
          for(int i=1;i<=2;i++){
              System.out.println("1st Thread"+i);
              try{
                 Thread.sleep(1000);
              }
              catch(InterruptedException ie)
              {
                  System.out.println(ie);
              }
          }
      }
}
class ThreadLogic2 implements Runnable{
      public void run(){
          for(int i=3;i<=4;i++){
              System.out.println("2nd Thread"+i);
              try{
                 Thread.sleep(1000);
              }
              catch(InterruptedException ie)
              {
                  System.out.println(ie);
              }
          }
      }
}
class MyThread{
      Thread t;
      void createThread(){
          ThreadLogic1 tl1=new ThreadLogic1();
          t=new Thread(tl1);
          t.start();

          ThreadLogic2 tl2=new ThreadLogic2();
          t=new Thread(tl2);
          t.start();
      }
      
}
class Demo1{
      public static void main(String args[]){
          MyThread m=new MyThread();
          m.createThread();
      }
}