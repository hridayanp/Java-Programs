/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to define a class and demonstrate constructor overloading.
 */

class Student{
    int id;
    String name;
    int age;
    Student(){
        System.out.println("Default Constructor");
    }
    Student(int i, String n){
        id=i;
        name=n;
        System.out.println("Parameterized Constructor 1");
    }
    Student(int i, String n, int a){
        id=i;
        name=n;
        age=a;
        System.out.println("Parameterized Constructor 2");
    }
    void display(){
        System.out.println("ID: "+id+" Name: "+name+" Age: "+age+"\n");
    }
}
public class QP1_L3{
    public static void main(String args[]){
        Student s= new Student();
        s.display();
        Student s1= new Student(11, "Hridayan");
        s1.display();
        Student s2= new Student(11, "Hridayan", 21);
        s2.display();
    }
}

/**
 * OUTPUT:

Default Constructor
ID: 0 Name: null Age: 0

Parameterized Constructor 1  
ID: 11 Name: Hridayan Age: 0

Parameterized Constructor 2
ID: 11 Name: Hridayan Age: 21

 */