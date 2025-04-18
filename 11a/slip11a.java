// Write a Multithreading program using Runnable interface to blink Text on the frame. 

import java.awt.*;
import java.awt.event.*;

public class slip11a extends Frame implements Runnable{
    Thread t;
    Label l1;
    int f;

    public slip11a()
    {
        t=new Thread(this);
        t.start();
        setLayout(null);
        l1=new Label("Hello Java");
        l1.setBounds(100,100,100,40);
        add(l1);
        setSize(300,300);
        setVisible(true);
        addWindowFocusListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        f=0;
    }
    public void run(){
        try
        {
            if(f==0){
                t.sleep(200);
                l1.setText(" ");
                f=1;
            }
            if(f==1){
                t.sleep(200);
                l1.setText("Hello Java");
                f=0;
            }
            run();

        }catch(InterruptedException e){
                System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new slip11a();
    }
}