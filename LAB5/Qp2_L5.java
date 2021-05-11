/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to read the details of 5 students and display the details of all students.
*/

import java.util.*;
class Student{
    String name;
    int regd_no, roll_no;
    char sec;
    static int flag= 0;
    Student(){
        flag++;
        System.out.println("Object["+flag+"] created!");
    }
    Student(String name1, int regd, int roll, char section){
        name= name1;
        regd_no= regd;
        roll_no= roll;
        sec= section;
    }
    void display(){
        System.out.println("\nName : "+name);
        System.out.println("Reg Number : "+regd_no);
        System.out.println("Section : "+sec);
        System.out.println("Roll Number : "+roll_no);
    }
}
public class Qp2_L5 {
    public static void main(String args[]) {
        String name;
        int regd_no, roll_no, i, n;
        char sec;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter total objects:");
        n= input.nextInt();
        Student stu[]= new Student[n];
        for(i=0; i<n; i++){
            System.out.println("\nEnter name:");
            name= input.next();
            System.out.println("Enter registration number:");
            regd_no= input.nextInt();
            System.out.println("Enter roll no.:");
            roll_no= input.nextInt();
            System.out.println("Enter section:");
            sec= input.next().charAt(0);
            stu[i]= new Student(name, regd_no, roll_no, sec);
        }
        System.out.println("\nStudent Details are shown below:");
        for(i=0; i<n; i++){
            stu[i].display();
            stu[i]= new Student();
        }
    }
}

/**
 * OUTPUT:
Enter total objects:
5

Enter name:
Bayek
Enter registration number:
101
Enter roll no.:
1 
Enter section:
B

Enter name:
Alexios
Enter registration number:
102
Enter roll no.:
2
Enter section:
B

Enter name:
Eivor
Enter registration number:
103
Enter roll no.:
3
Enter section:
B

Enter name:
Ezio
Enter registration number:
104
Enter roll no.:
4
Enter section:
B

Enter name:
Arno
Enter registration number:
105
Enter roll no.:
5
Enter section:
B

Student Details are shown below:

Name : Bayek
Reg Number : 101
Section : B
Roll Number : 1
Object[1] created!

Name : Alexios
Reg Number : 102
Section : B
Roll Number : 2
Object[2] created!

Name : Eivor
Reg Number : 103
Section : B
Roll Number : 3
Object[3] created!

Name : Ezio
Reg Number : 104
Section : B
Roll Number : 4
Object[4] created!

Name : Arno
Reg Number : 105
Section : B
Roll Number : 5
Object[5] created!
*/