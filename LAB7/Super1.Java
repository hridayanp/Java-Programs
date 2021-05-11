/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to to show the utility of super keyword.
*/

class SuperClass{
    int num= 100;
    SuperClass(){
        System.out.println("Super Class");
    }
}
class SubClass extends SuperClass{
    int num= 110;
    SubClass(){
        super();
    }
    void printNum(){
        System.out.println("Sub Class");
        System.out.println("From super class, number: "+super.num);
        System.out.println("From sub class, number: "+num);
    }
}
class Super1{
    public static void main(String args[]) {
        SubClass obj= new SubClass();
        obj.printNum();
    }
}

/**
 * OUTPUT:
PS C:\margrop\Java\AP_LAB\LAB7> javac Super1.java
PS C:\margrop\Java\AP_LAB\LAB7> java Super1
Super Class
Sub Class
From super class, number: 100
From sub class, number: 110  
PS C:\margrop\Java\AP_LAB\LAB7> 
*/