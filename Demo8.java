class First{
    synchronized void meth(String msg){
        System.out.print("["+ msg);
        try{
           Thread.sleep(10000);
        }
        catch(InterruptedException ie){
        }
        System.out.println("]");
    } 
}

class MyThread implements Runnable{
    Thread t;
    First f;
    String str="";

    MyThread(First obj,String msg){
        f=obj;
        str=msg;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        f.meth(str);
    }
}

class Demo8{
   public static void main(String args[]){
       First f1=new First();
       new MyThread(f1,"CPC");
       new MyThread(f1,"Academy");
       new MyThread(f1,"Pune");
   }
}