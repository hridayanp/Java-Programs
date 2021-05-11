/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to add five integer numbers using the concept of command line arguments.
*/

public class QP2_L3{
    public static void main(String args[]) {
        int sum;
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        int e=Integer.parseInt(args[4]);
        sum=a+b+c+d+e;
        System.out.println("SUM: "+sum);
    }
}

/*
 * OUTPUT:
C:\margrop\Java\AP_LAB\LAB3> javac QP2_L3.java
C:\margrop\Java\AP_LAB\LAB3> java QP2_L3 1 2 3 4 5
SUM: 15
C:\margrop\Java\AP_LAB\LAB3> 
*/