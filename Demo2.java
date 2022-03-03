class MyThread implements Runnable{
     Thread t;
     MyThread(String tname){
        t=new Thread(this,tname);
        t.start();
     }

     public void run(){
        for(int i=1;i<=4;i++){
            System.out.println(t.getName()+" "+i);
            try{
               Thread.sleep(1000);
            }  
            catch(InterruptedException ie){
               System.out.println(ie);
            }
        }
     }
}

class Demo2{
     public static void main(String args[]){
           new MyThread("one");
           new MyThread("two");
           new MyThread("three");
     }
}