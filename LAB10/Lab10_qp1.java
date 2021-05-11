/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: 
 * a) A Java program to implement the concept of importing classes from user defined package and creating packages.
 * b) A Java program to validate access specifier table discussed in lecture 2 of package.
*/

package calc;
import java.util.Scanner;
class Calculator{
    public void add(int a, int b){
        System.out.println("Result is:"+ (a+b));
    }
    public void diff(int a, int b){
        System.out.println("Result is:"+ (a-b));
    }
    public void prod(int a, int b){
        System.out.println("Result is:"+ (a*b));
    }
    public void div(int a, int b){
        System.out.println("Result is:"+ (a/b));
    }
}
public class Lab10_qp1{
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        
        while(true){
            Calculator calc= new Calculator();
            System.out.println("\n1.Addition 2.Difference 3.Product 4.Division 5.Exit");
            System.out.println("\nEnter choice:");
            int choice= input.nextInt();
            System.out.println("\nEnter two numbers:");
            int a= input.nextInt();
            int b= input.nextInt();
            switch(choice){
                case 1: calc.add(a, b);
                        break;
                case 2: calc.diff(a, b);
                        break;
                case 3: calc.prod(a, b);
                        break;
                case 4: calc.div(a, b);
                        break;
                case 5: System.out.println("Exitting");
                        System.exit(0);
                default: System.out.println("Invalid choice");
                         break;   
            }
        }
    }    
}

/**
 * OUTPUT:
PS C:\margrop\Java\AP_LAB\LAB10> javac -d . Lab10_qp1.java
PS C:\margrop\Java\AP_LAB\LAB10> java calc/Lab10_qp1 

1.Addition 2.Difference 3.Product 4.Division 5.Exit

Enter choice:
1

Enter two numbers:
1
2
Result is:3

1.Addition 2.Difference 3.Product 4.Division 5.Exit

Enter choice:
2

Enter two numbers:
3
2
Result is:1

1.Addition 2.Difference 3.Product 4.Division 5.Exit

Enter choice:
3

Enter two numbers:
2
3
Result is:6

1.Addition 2.Difference 3.Product 4.Division 5.Exit

Enter choice:
4

Enter two numbers:
8
4
Result is:2

1.Addition 2.Difference 3.Product 4.Division 5.Exit

Enter choice:
5

Exitting
PS C:\margrop\Java\AP_LAB\LAB10> 
*/