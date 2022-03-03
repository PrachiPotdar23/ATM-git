class MyThread1 implements Runnable
{
  Thread t;
  Thread obj;

  MyThread1(String tname)
  {
    t=new Thread(this, tname);
    t.start();
  }
   
  public void run()
   {
     for(int i=1; i<=10; i++)
      {
         System.out.println(t.getName() + " : " + i);

         try
          {
            Thread.sleep(1000); 
            if(i==7) obj.join();
          }
         catch(InterruptedException ie)
          {} 

      } 
   } 

}

class MyThread2 implements Runnable
{
  Thread t;
  Thread obj;

  MyThread2(String tname, Thread obj)
  {
    this.obj=obj;

    t=new Thread(this, tname);
    t.start();
  }
   
  public void run()
   {

     for(int i=11; i<=20; i++)
      {
         System.out.println(t.getName() + " : " + i);

         try
          {
            Thread.sleep(1000); 
            if(i==15) obj.join();
          }
         catch(InterruptedException ie)
          {} 

      } 

   } 
}
class MyThread3 implements Runnable
{
  Thread t;
  Thread obj;

  MyThread3(String tname, Thread obj)
  {
    this.obj=obj;

    t=new Thread(this, tname);
    t.start();
  }
   
  public void run()
   {

     for(int i=21; i<=30; i++)
      {
         System.out.println(t.getName() + " : " + i);

         try
          {
            Thread.sleep(1000); 
            if(i==25) obj.join();
          }
         catch(InterruptedException ie)
          {} 

      } 

   } 
}

class PracticeT1
{
  public static void main(String args[ ])
   {
      MyThread1 m1=new MyThread1("One");
      MyThread2 m2=new MyThread2("Two", m1.t);
      MyThread3 m3=new MyThread3("Two", m2.t);
      m1.obj=m3.t;
   }
}