class First{
   int i;
   int b=0;
   synchronized void put(int num){
      if(b==0){
        i=num;
        System.out.println("Put:"+i); 
        notifyAll();
        b=1;
      }
      else{
        try{
          wait();
        }
        catch(InterruptedException ie){}
      }
     
   }
   synchronized int get(){
      if(b==1){
        System.out.println("Get:"+i); 
        notifyAll();  
        b=2;
      }
      else{
        try{
           wait();
        }
        catch(InterruptedException ie){}
      } 
      return i;
 
    }
   synchronized void getSquare(){
      if(b==2){
        System.out.println("GetSquare:"+i*i);
        notifyAll();
        b=0;
      }
      else{
        try{
          wait();
        }
        catch(InterruptedException ie){}
      }
      
   } 
}

class Putter implements Runnable{
   Thread t;
   First f;
    
   Putter(First obj){
    f=obj;
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

class Getter implements Runnable{
   Thread t;
   First f;

   Getter(First obj){
       f=obj;
       t=new Thread(this);
       t.start();
   }
    
   public void run(){
      while(f.i<30){
         f.get();
      }
   }
}

class GetSquare implements Runnable{
   Thread t;
   First f;

   GetSquare(First obj){
     f=obj;
     t=new Thread(this);
     t.start();
   }
   public void run(){
     while(f.i<30){
         f.getSquare();
     }
   }
}

class Demo10{
   public static void main(String[] args){
     First f1=new First();
   
     new Putter(f1);
     new Getter(f1);
     new GetSquare(f1);
   }
}












