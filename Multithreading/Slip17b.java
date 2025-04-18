import java.awt.*;
import java.applet.*;

<applet code='Slip17b' extends Applet implements Runnable{
    Thread t;
    int r,g1,i,y;

    public void run(){
        t=new Thread(this);
        t.start();
        r=0;
        g1=0;
        i=0;
        y=0;
    }

    public void run(){
        try{
            for(i=24;i>=1;i--){
                if(i>16 && i<=24){
                    t.sleep(200);
                    r=1;
                    repaint();
                }
                if(i>8 && i<=16){
                    t.sleep(200);
                    y=1;
                    repaint();
                }
                if(i>1 && i<=8){
                    t.sleep(200);
                    g1=1;
                    repaint();
                }
            }
            if(i==0){
                run();
            }
        }
        catch(Exception e){}
    }
    public void paint(Graphics g){
        g.drawRect(100,100,300);

        if(r==1){
            g.setColor(color.red);
            g.fillOval(100,100,100,100);
            g.setColor(color.black);
            g.drawOval(100,200,100,200);
            g.drawOval(100,300,100,300);
            r=0;
        }

        if(y==1){
            g.drawOval(100,100,100,100);
            g.drawOval(100,300,100,100);
            g.setColor(color.yellow);
            g.fillOval(100,200,100,100);
            y=0;
        }

        if(g1==1){
            g.drawOval(100,100,100,100);
            g.drawOval(100,200,100,100);
            g.setColor(color.green);
            g.fillOval(100,300,100,100);
            g1=0;
        }
    }
}