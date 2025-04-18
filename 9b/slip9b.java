// write a multithreading program in java to convert smiling face into the crying face after 5 seconds

import java.awt.*;
import java.awt.event.*;
// import jdk.jshell.spi.ExecutionControl;
public class slip9b extends Frame implements Runnable
{
    Thread t ; 
    int x,y;
    // boolean isSmiling = true 
    slip9b(String z)
    {
        super(z);
        x=180;
        y=180;
        t=new Thread(this);
        this.setLayout(new FlowLayout());
        this.setSize(800,800);
        addWindowFocusListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        t.start(); 
        this.setVisible(true);
    }
    public void run()
    {
        while (true) 
        { 
          try
          {
                Thread.sleep(1000);
          }  
          catch(Exception e){
            // e.printStackTrace();
          }
          if(x==180 && y ==180)
        // isSmiling = !isSmiling;
        // if(isSmiling)
          {
            x=0;
            y=180;
          }
          else
          {
            x=180;
            y=180;
          }
          repaint();
        }
    }
    public void paint(Graphics g)
    {
        g.drawOval(100,150,150,150);
        g.drawOval(140,160,20,20);
        g.drawOval(180,160,20,20);
        g.drawLine(165,185,165,220);
        g.drawArc(150,260,30,20,x,y);
    }
    public static void main(String[] args) {
        new slip9b("Smiley");
    }
}