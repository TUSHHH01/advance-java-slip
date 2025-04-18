import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Slip9b1 extends Frame implements Runnable
{
    Thread t; 
    int mouthY;
    boolean isSmiling;

    Slip9b1(String z)
    {
        super(z);
        mouthY = 280;
        isSmiling = true;
        t = new Thread(this);
        this.setLayout(new FlowLayout());
        this.setSize(800,800);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        t.start();
        this.setVisible(true);
    }

    public void run(){
        while(true)
        {
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
            if(isSmiling)
            {
                mouthY = 300;
                isSmiling = false;
            }
            else{
                mouthY = 280;
                isSmiling = true;
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
        g.drawArc(150, mouthY, 100, 50, 0, -180);
    }

    public static void main(String a[])
    {
        new Slip9b1("Smiley");
    }
}