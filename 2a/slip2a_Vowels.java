// Q.2a. Write a multithreading program in java to display all the vowels from a given String.

class slip2a_Vowels implements Runnable
{
    String s1 ;
    Thread t;
    slip2a_Vowels(String j)
    {
        s1 = j ;
        t= new Thread(this);
        t.start();
    }
    public void run()
    {
        int x  ;
        char ch;
        x = s1.length();
        for(int i=0;i<x;i++)
        {
            ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' || ch=='U')
            {
                System.out.print(ch);
            }
        }
    }
    public static void main(String[] args)
    {
        new slip2a_Vowels(args[0]);
    }

}


// class slip2a_Vowels implements Runnable
// {
//     String s1,s2 ;
//     Thread t ;
//     slip2a_Vowels(String j)
//     {
//         s1 = j;
//         t = new Thread(this);
//         t.start();
//     }

//     public void run()
//     {
//         int x ;
//         char ch ;
//         x = s1.length();
//         for(int i = 0 ; i < x ; i++)
//         {
//             ch = s1.charAt(i);
//             if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
//             {
//                 System.out.println(ch);
//             }
//         } 

//     }

//     public static void main(String[] args) {
//         new slip2a_Vowels(args[0]);
//     }
// }

// 3 time 
// class slip2a_Vowels implements Runnable     // practice 
// {
//     String a ;
//     Thread t ;
//     slip2a_Vowels(String j)
//     {
//         a = j ;
//         t = new Thread(this);
//         t.start();
//     }
//     public void run()
//     {
//         char ch ;
//         for(int i = 0 ; i < a.length() ; i++)
//         {
//             ch = a.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U'  )
//             {
//                 System.out.println(ch);
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         new slip2a_Vowels(args[0]);    
//     }
// }