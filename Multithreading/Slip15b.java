public class Slip15b extends Thread{
    public void run(){
        System.out.println("Hello World");
    }
    public static void main(String args[]){
        Slip15b th=new Slip15b();
        th.start();
    }
}