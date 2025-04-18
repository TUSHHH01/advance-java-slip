public class Slip2a implements Runnable{
    String s1,s2;
    Thread t;

    Slip2a(String j){
        s1=j;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        int x=0;
        char ch;
        x=s1.length();
        for(int 0;i<x;i++){
            ch=s1.charAt(i){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    System.out.println(ch);
                }
            }
            public static void main(String[] args){
                new Slip2a(args[3]);
            }
        }
    }
}