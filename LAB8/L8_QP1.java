/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to demonstrate Multiple Inheritance in a Student Class.
*/

import java.util.*;
class Student{
    public int roll, marks1, marks2;
    public String name, dept;
}

class Marks extends Student{
    Scanner input= new Scanner(System.in);
    void get_details(){
        System.out.print("Enter the Name : ");
        name = input.nextLine();
        System.out.print("Enter the Department : ");
        dept = input.nextLine();
        System.out.print("Enter the Roll Number : ");
        roll = input.nextInt();
        System.out.print("Enter the Marks 1 : ");
        marks1 = input.nextInt();
        System.out.print("Enter the Marks 2 : ");
        marks2 = input.nextInt();
    }
    void put_details(){
        System.out.println("\nStudent Details: \n\nName: "+name+"\nDepartment: "+dept+"\nRoll No.: "+roll+"\nMarks1: "+marks1+"\nMarks2: "+marks2);
    }
}

interface Sports{
    public void get_sports_wt();
}

class Result extends Marks implements Sports{
    int sport_wt;
    Scanner input2= new Scanner(System.in);
    public void get_sports_wt(){
        System.out.println("Enter the Sport Weight:");
        sport_wt= input2.nextInt();
    }
    void total_marks(){
        int total;
        total= marks1+marks2+sport_wt;
        System.out.println("\nSport Weight: "+sport_wt+"\nTotal Marks: "+total);
    }
}

public class L8_QP1{
    public static void main(String args[]) {
        Result obj= new Result();
        obj.get_details();
        obj.get_sports_wt();
        obj.put_details();
        obj.total_marks();
    }
}

/**
 * OUTPUT:
C:\margrop\Java\AP_LAB\LAB8> javac L8_QP1.java
C:\margrop\Java\AP_LAB\LAB8> java L8_QP1
Enter the Name : Hridayan
Enter the Department : CSE
Enter the Roll Number : 535
Enter the Marks 1 : 10
Enter the Marks 2 : 10
Enter the Sport Weight:
80

Student Details: 

Name: Hridayan   
Department: CSE  
Roll No.: 535    
Marks1: 10
Marks2: 10

Sport Weight: 80
Total Marks: 100
C:\margrop\Java\AP_LAB\LAB8> 

*/