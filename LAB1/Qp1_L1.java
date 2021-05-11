/*
    Author: Hridayan Phukan
    Description: A program to initialize data members of student class and display it.
*/

import java.util.*;
class Student{
    int id;
    String fname;
    String lname;
    void display(){
        System.out.println("\nRoll No.: "+id+"\nFirst Name: "+fname+"\nLast Name: "+lname);
    }
}
public class Qp1_L1{
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        Student stu= new Student();
        System.out.println("\nEnter total number of students:");
        int n= input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("\nEnter student roll no:");
            stu.id= input.nextInt();
            System.out.println("Enter student first and last name no:");
            stu.fname= input.next();
            stu.lname= input.next();
            stu.display();
        }
        input.close();
    }
}

/**
 * OUTPUT:

PS C:\margrop\Java\AP_LAB\LAB1> javac .\Qp1_L1.java
PS C:\margrop\Java\AP_LAB\LAB1> java .\Qp1_L1

Enter total number of students:
2

Enter student roll no:
1
Enter student first and last name no:
Hridayan
Phukan

Roll No.: 1
First Name: Hridayan  
Last Name: Phukan     

Enter student roll no:
2
Enter student first and last name no:
Ragnar
Lothbrok

Roll No.: 2
First Name: Ragnar
Last Name: Lothbrok
PS C:\margrop\Java\AP_LAB\LAB1>

*/