// Write a java program using multithreading to execute the threads sequentially.
//       (Use Synchronized Method)

class CallMe{
    Synchronized void call(String msg)
    //void call (String msg)
    {
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted..");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;
    public Caller(CallMe tar,String s){
        target=tar;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        //sunchronized(target)
        //{
            target.call(msg);
        // }
    }
}
class slip18a{
    public static void main(String args[]){
        CallMe target=new CallMe();
        Caller ob1=new Caller(target,'Hello');
        Caller ob2=new Caller(target,'World');
        Caller ob3=new Caller(target,'Synchronized');
    }
}