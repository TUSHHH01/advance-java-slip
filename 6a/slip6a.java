// Write a java program which will display name and priority of current thread. Change name of Thread to MyThread and priority to 2. 
// Display the details of Thread.

public class slip6a 
{

    public static void main(String[] args) 
    {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());

        t.setPriority(2);
        t.setName("MyThread");

        System.out.println("Thread with new name: " + t.getName());
        System.out.println("Thread with new Priority: " + t.getPriority());

        // try{
        //     for(int n=5;n>0;n--){
        //         System.out.println(n);
        //         t.sleep(1000);
        //     }
        // }
        // catch(InterruptedException e){
        //     System.out.println("Main thread Interrupted");
        // }
    }
}
