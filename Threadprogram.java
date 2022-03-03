class Threadprogram{
    public static void main(String args[])
    {
        Thread t;
        t=Thread.currentThread();
        System.out.println(t);  
        t.setName("My Thread");
        System.out.println(t);
        String tname=t.getName();
        System.out.println(tname);
        
        for(int i=1;i<=4;i++){
           System.out.println(i);
           try{
             Thread.sleep(1000);
           }
           catch(InterruptedException ie){
             System.out.println(ie);
           }
        }
    }
}