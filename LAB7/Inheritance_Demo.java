/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to show how single inheritance works.
*/

class Animal{
    Animal(){
        System.out.println("This is Animal Class");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("This is Dog class");
    }
    void display(){
        System.out.println("This is how Single Inheritance works");
    };
}
public class Inheritance_Demo{
    public static void main(String args[]) {
       Dog obj= new Dog();
       obj.display();
    }
}

/**
 * OUTPUT:
PS C:\margrop\Java\AP_LAB\LAB7> javac Inheritance_Demo.java
PS C:\margrop\Java\AP_LAB\LAB7> java Inheritance_Demo
This is Animal Class
This is Dog class
This is how Single Inheritance works
PS C:\margrop\Java\AP_LAB\LAB7> 
*/