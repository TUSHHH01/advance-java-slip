// a. Write a multithreading program in java to display all the vowels from a given String.

class vowel implements Runnable
{
    String a ;
    Thread t ;
    vowel(String j)
    {
        a = j ;
        t = new Thread(this);
        t.start();

    }
    public void run()
    {
        char ch ;

        for(int i = 0 ; i < a.length();i++)
        {
            ch = a.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
            {
                System.out.println(ch);
            }
        }

    }
    public static void main(String args[]) {
        new vowel(args[0]); 
    }
}