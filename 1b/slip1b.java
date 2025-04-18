import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class slip1b extends Applet implements Runnable, ActionListener
{
    Thread t1;
    TextField txt1;
    Button btnStart;

    public void init() 
    {
        txt1 = new TextField(20);
        btnStart = new Button("Start");
        btnStart.addActionListener(this);
        add(txt1);
        add(btnStart);
    }

    public void run() 
    {
        for (int i = 1; i <= 100; i++) {
            txt1.setText("" + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void slip1b(ActionEvent ae) 
    {
        if (ae.getSource() == btnStart) {
            t1 = new Thread(this);
            t1.start();
        }
    }
}
