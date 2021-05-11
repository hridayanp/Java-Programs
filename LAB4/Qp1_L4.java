/*
    * AUTHOR: Hridayan Phukan
    * DESCRIPTION: A Java program to find the sum of the series: 2+4+6+...upto nth term. 
*/

import java.util.*;
public class Qp1_L4{
    public static int sumOfSeries(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                sum=sum+i;
            }  
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter nth term for the series:");
        int n= input.nextInt();
        int series= sumOfSeries(n);
        System.out.println("Sum of series upto "+n+" terms: "+series);
        input.close();
    }
}

/**
 * OUTPUT:
Enter nth term for the series:
10
Sum of series upto 10 terms: 30
*/