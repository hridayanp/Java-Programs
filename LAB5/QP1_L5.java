/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to demonstrate the concept of call by value and call by reference mechanism of method calling.
*/

class CallMethods1{
    void callByValue(int i, int j){
        System.out.println("\nDemonstrating Call by Value.");
        i= i*2;
        j= j/2;
        System.out.println("Value of a: "+i+" and b: "+j+"\n");
    }
}
class CallMethods2{
    int c, d;
    CallMethods2(int x, int y){
        c= x;
        d= y;
    }
    void callByReference(CallMethods2 o){
        System.out.println("\nDemonstrating Call by Reference.");
        o.c= o.c*2;
        o.d= o.d/2;
        System.out.println("Value of m: "+o.c+" and n: "+o.d);
    }
}
public class QP1_L5 {
    public static void main(String[] args) {
        
        //Call by Value
        CallMethods1 obj1= new CallMethods1();
        int a= 300, b= 300;
        System.out.println("\nBefore calling, value of a: "+a+" and b: "+b);
        obj1.callByValue(a, b);
        System.out.println("After calling, value of a: "+a+" and b: "+b);
        System.out.println("--------------------------------------------------------------");
        //Call By Reference
        CallMethods2 obj2= new CallMethods2(300, 300);
        System.out.println("Before calling, value of c: "+obj2.c+" and d: "+obj2.d);
        obj2.callByReference(obj2);
        System.out.println("\nAfter calling, value of c: "+obj2.c+" and d: "+obj2.d);
    }
}

/**
 * OUTPUT:
Before calling, value of a: 300 and b: 300

Demonstrating Call by Value.
Value of a: 600 and b: 150

After calling, value of a: 300 and b: 300
--------------------------------------------------------------
Before calling, value of c: 300 and d: 300

Demonstrating Call by Reference
Value of m: 600 and n: 150

After calling, value of c: 600 and d: 150
*/