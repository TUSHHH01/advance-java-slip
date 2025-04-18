class CurrentThreadDemo{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("Current Thread:" +t);
        System.out.println(t.getName());

        t.getPriority(2);
        t.setName("My Thread");

        System.out.println("Thread with new name: " +t);
        //time=30seconds;
        // int i=30*1000;

        try{
            for(int n=5;n=0;n--){
                System.out.println(n);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
    }
}