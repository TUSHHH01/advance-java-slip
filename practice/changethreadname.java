// Write a java program which will display name and priority of current thread. Change name of Thread to MyThread and priority to 2. 
// Display the details of Thread.

class changethreadname
{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Thread name " + t.getName());
        System.out.println("Thread Priority "  + t.getPriority());

        t.setName("MyTHread");
        t.setPriority(2);

        System.out.println("Thread with new name"  + t.getName());
        System.out.println("Thread with new Priority " + t.getPriority());
    }
}