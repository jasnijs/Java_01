package lectures;
import java.util.Scanner;

import java.net.InetAddress;

public class Lecture_2705 {
    public static void main(String[] args) {


        try {
            InetAddress ip = InetAddress.getByName("www.inbox.lv");
            InetAddress ip1[] = InetAddress.getAllByName("www.inbox.lv") ;
            boolean reachable = ip.isReachable(10000);

            System.out.println("ip: " + ip);
            System.out.println("ip1 : "+ip1);
            System.out.println("Host Address: " +ip.getHostAddress());
            System.out.println("Is reachable or not?" + reachable);
        } catch (Exception e) {
            e.printStackTrace();
        }




//        Scanner sc=new Scanner(System.in);
//        double d=sc.nextInt();
//        double t=sc.nextInt();
//
//        class  InternetSpeed
//        {
//            public static void main(String args[])
//            {
//
//                Scanner sc=new Scanner(System.in);
//                System.out.println("enter data in mega bytes");
//                double d=sc.nextInt();
//                System.out.println("enter time in minutes");
//                double t=sc.nextInt();
//                double s=(d*1000)/(t*60);
//                System.out.println("internet speed = "+s);
//            }
//        }



    }

}
