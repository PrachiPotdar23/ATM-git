class First{
  int i;
  boolean b= false;

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
   Putter(First f){
     this.f=f;
     t=new Thread(this);
     t.start();
   }

   public void run(){
      int k=0;
      while(f.i<30){
          f.put(k);
          k++;
      }
   }
}
class Getter implements Runnable{
  Thread t;
  First f;
   Getter(First f){
     this.f=f;
     t=new Thread(this);
     t.start();
   }

   public void run(){
      while(f.i<30){
         f.get();
      }
   }
}
class DemoT1{
    public static void main(String args[]){
       First f1=new First();
       Putter p=new Putter(f1);
       try{
          Thread.sleep(1000);
        }
       catch(InterruptedException ie){}
       Getter g=new Getter(f1);
    }
}