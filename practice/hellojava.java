


// Write a java program to display “Hello Java” message n times on the screen.

class JavaThread implements Runnable
{

    Thread t ;


    public JavaThread() {
        t = new Thread(this);
        t.start();
    }
    
    public void run()
    { 
        try 
        {
            for(int i = 0 ; i < 5 ; i++)
            {           
                System.out.println("Hello java");
                Thread.sleep(500);
            } 
            
        }
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
    }
}
class hellojava
{  
        public static void main(String[] args) {
        JavaThread jt = new  JavaThread();
    }
}