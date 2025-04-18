// Write a java  program to create a basic java THread that print "Helo , world!" when executed.

public class Slip15b extends Thread{
    public void run()
    {
        System.out.println("Helo,world!");
    }
    public static void main(String[] args) {
        {
            Slip15b th = new Slip15b();
            th.start();
        }
    }
}