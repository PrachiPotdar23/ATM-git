class MyThread{
     Thread t;
     MyThread(String tname1,String tname2){
          t=new Thread(tname1,tname2);
          t.start();
     }
     public void run(){
          System.out.println(t.getName()+"is 1st Thread");    
     }
     public void run(int num1,int num2){
          System.out.println(t.getName()+num1+num2);
     }
}
class Childthread{
     public static void main(String args[]){
          MyThread m=new MyThread("1st thread","2nd thread");
          m.run();
          m.run(4,5);
     }
}