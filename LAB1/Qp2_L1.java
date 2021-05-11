/*
    Author: Hridayan Phukan
    Description: A program to calculate area of rectangle and display the result using more than two objects.
*/

import java.util.*;
class Rectangle{
    int length, breadth;
    void area(){
        System.out.println("\nArea of rectangle: "+(length*breadth));
    }
}
public class Qp2_L1 {
    public static void main(String args[]) {
        int i, n;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter total objects:");
        n= input.nextInt();
        Rectangle rect[]= new Rectangle[n];
        for(i=0; i<n; i++){
            rect[i]= new Rectangle();
            System.out.println("\nEnter length of rectangle:");
            rect[i].length= input.nextInt();
            System.out.println("Enter breadth of rectangle:");
            rect[i].breadth= input.nextInt();
            rect[i].area();
        }
        input.close();
    }
}

/**
 * OUTPUT:
PS C:\margrop\Java\AP_LAB\LAB1> javac .\Qp2_L1.java
PS C:\margrop\Java\AP_LAB\LAB1> java .\Qp2_L1

Enter total objects:
2

Enter length of rectangle:
1
Enter breadth of rectangle:
1

Area of rectangle: 1      

Enter length of rectangle:
2
Enter breadth of rectangle:
2

Area of rectangle: 4
PS C:\margrop\Java\AP_LAB\LAB1> 

*/