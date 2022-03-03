class First{
   int i;
   boolean b=false;

   synchronized void put(int num){
      if(b){

      try{
         wait();
      }
      catch(InterruptedException ie){}
      }
 
      i=num;
      System.out.println("Put:"+i);
      notify();
      b=true;
   }

   synchronized int get(){
      if(!b){
        try{
           wait();
         }
        catch(InterruptedException ie){}
      }
      System.out.println("Get:"+i);
      notify();
      b=false;
      return i;
   }
}

class Putter implements Runnable{
    Thread t;
    First f;
        
    Putter(First z){
       f=z;
       t=new Thread(this);
       t.start();
    }
    public void run(){
      int k=0;
   
      while(f.i<30){
        f.put(++k);
      }
    }
     
}

class Getter implements Runnable
{
   Thread t;
   First f;

   Getter(First z){
      f=z;
      t=new Thread(this);
      t.start();
    }
 
   public void run(){
     while(f.i<30){
        f.get();
     }
   }
}

class Demo9{
   public static void main(String args[]){
      First f1=new First();

      new Putter(f1);
      new Getter(f1);
   }
}












