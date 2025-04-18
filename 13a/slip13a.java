// Write a JAVA program which will generate the threads: 

// - To display 10 terms of Fibonacci series.
// - To display 1 to 10 in reverse order.	

import java.io.*;

class Fibonacci extends Thread{
    public void run(){
        try{
            int a=0,b=1,c=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the limit for Fibonnaci:");
            int n=Integer.parseInt(br.readLine());
            System.out.println("\n ================ \n");
            System.out.println("Fibonnaci Series");

            while(n>0){
                System.out.println(c+" ");
                a=b;
                b=c;
                c=a+b;
                n=n-1;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
class Reverse extends Thread{
    public void run(){
        try{
            System.out.println("\n==============\n");
            System.out.println("\n Reverse is : \n");
            System.out.println("\n=============\n");

            for(int i=10;i>=1;i--){
                System.out.println(i+" ");
            }
            System.out.println("\n============\n");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
public class slip13a{
    public static void main(String[] args){
        try{
            Fibonacci fib=new Fibonacci();
            fib.start();
            fib.sleep(1000);
            Reverse rev=new Reverse();
            rev.start();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}