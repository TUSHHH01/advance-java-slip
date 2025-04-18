// Write a java program to display “Hello Java” message n times on the screen. (Use Runnable Interface).

import java.io.*;

class JavaThread implements Runnable 
{
    Thread t1;

    JavaThread(String s) 
    {
        t1 = new Thread(this, s);
        // System.out.println(t1.getName());
        t1.start();
    }

    public void run() 
    {
        try {
            for (int i = 1; i < 50; i++) 
            {
                System.out.println("Hello Java");
                t1.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
        
    }
}

class Slip3a 
{
    public static void main(String args[]) throws IOException {
        JavaThread jt = new JavaThread("JavaThread");
    }
}

// import java.io.*;
// class JavaThread implements Runnable
// {
//     Thread t ;
//     JavaThread(String a)
//     {
//         t = new Thread(this,a);
//         t.start();
//     }
//     public void run()
//     {   
//         try
//         {
//             for(int i = 0 ; i <= 50 ; i++)
//             {
//             System.out.println("Hello java");
//             t.sleep(500);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("Thread interruped:" +e);
//         }
//     }
// }    

// class Slip3a
// {
//     public static void main(String args[]) throws IOException
//     {
//         JavaThread jt = new JavaThread("JavaThread");
//     }
// }