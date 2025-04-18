import java.io.*;
class JavaThread implements Runnable{
    Thread t;
    JavaThread(String s){
        t1=new Thread(this,s);
        System.out.println(t1.getName());
        t1.start();
    }
    public void run(){
        try{
            for(int i=1;i<=50;i++){
                System.out.println("Hello Java");
                t1.sleep(500);
            }
        }
        catch(InterruptedException e){}
    }
}
class Slip3a{
    public static void main(String args[])throws IOException{
        JavaThread jt=new JavaThread("JavaThread");
    }
}