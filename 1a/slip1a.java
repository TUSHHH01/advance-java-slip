


// Write a java program to display IP Address and Name of the machine.


import java.net.*;

class slip1a 
{
    public static void main(String[] args) throws UnknownHostException 
    {
        InetAddress h = InetAddress.getLocalHost();
        System.out.println(h);
        System.out.println(h.getHostName());
        System.out.println(h.getHostAddress());
    }
}

// import java.net.*;
// class slip1a
// {
//     public static void main(String[] args) throws UnknownHostException
//     {
//         InetAddress h = InetAddress.getLocalHost();
//         System.out.println(h);
//         System.out.println(h.getHostName());
//         System.out.println(h.getHostAddress());
//     }
// }