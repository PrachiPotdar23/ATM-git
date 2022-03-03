import java.applet.*;
import java.awt.*;

//<APPLET CODE=Test HEIGHT=400 WIDTH=800> </APPLET>

public class Test extends Applet implements Runnable{
    int x=0,y=0;
    Thread t;
    boolean b=true;
    public void init(){
      t=new Thread(this);
      t.start();
    }
    public void run(){
      while(true){
         repaint();
         try{
           Thread.sleep(50);
         }
         catch(InterruptedException ie){}
           if(b){
             x=x+5;
             y=y+10;
           }
           if(y>350){
             b=false;
           }
           if(!b){
             x=x+5;
             y=y-10;
           }
          if(y<=0){
            b=true;
          }
      }
    }
     
   public void paint(Graphics g){
      setBackground(Color.pink);
      setForeground(Color.red);
      g.fillOval(x,y,50,50);
   }
   
   
}

