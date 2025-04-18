import java.awt.*;
import java.applet.*;

// <applet code="Slip20b" width="400" height="350"></applet>

public class Slip20b extends Applet implements Runnable{
    Thread t;
    int f,y,f1,f2,f3;

    public void init(){
        t=new Thread(this);
        f=0;
        y=0;
        f1=0;
        t.start();
    }
    public void run(){
        try{
            if(f==0){
                t.sleep(10);
                y=y+5;
                repaint();
                if(f1==6)
                f1=0;
            }

            if(f1==1){
                t.sleep(10);
                y=y-5;
                repaint();
                if(f1==6)
                f1=0;
            }
        }
        catch(Exception e){}
        run();
    }
    public void paint(Graphics g){
        if(f==0){
            if(f1==1)
            g.setColor(color.green);

            if(f==2)
            g.setColor(color.blue);

            if(f==3)
            g.setColor(color.yellow);

            if(f==5)
            g.setColor(color.orange);
            g.fillOval(150,y+10;20,20);

            if(y==400){
                f1++;
                f=1;
            }
        }
        if(f==1){
            if(f1==1)
            g.setColor(color.green);

            if(f1==2)
            g.setColor(color.blue);

            if(f1==3)
            g.setColor(color.red);

            if(f1==4)
            g.setColor(color.yellow);

            if(f1==5)
            g.setColor(color.orange);
            g.fillOval(150,y-10,20,20);

            if(y==0){
                f1++;
                f=0;
            }
        }
    }
}