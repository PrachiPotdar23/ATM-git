class MyThread extends Thread{
     public void run(){
         for(int i=1;i<=4;i++){
            System.out.println(getName()+i);
            try{
               sleep(1000);
            }
            catch(InterruptedException ie){
            }
         }
     }
}
class Demo3{
    public static void main(String args[]){
        MyThread m=new MyThread();
        m.setName("one");
        m.start();
    }
}