class Thread1 extends Thread{
    int i=0;
    public void run(){
        try{
            while(i<=10){
                System.out.println("Welcome");
                Thread1.sleep(200);
                i++;
            }
        }
        catch(Exception e){

        }
    }
}
class Thread2 extends Thread{
    int i=0;
    public void run(){
        try{
            while(i<=10){
                System.out.println("Good Morning..");
                Thread2.sleep(200);
                i++;
            }
        }
        catch(Exception e){}
    }
}
public class Slip12b{
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();
    }
}