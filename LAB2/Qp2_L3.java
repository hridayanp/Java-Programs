/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to read data of an employee and compute net salary of an employee.
*/

import java.util.*;
class Employee{
    String emp_name;
    int emp_num;
    double basic, gross, da, it, net_sal;
    void inputDetails(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter empolyee ID:");
        emp_num= input.nextInt();
        System.out.println("Enter empolyee name:");
        emp_name= input.next();
        System.out.println("Enter basic salary:");
        basic= input.nextDouble();
        input.close();
    }
    void calc(){
        da= 0.52*basic;
        gross= basic+da;
        it= 0.30*gross;
        net_sal=gross-it;
    }
    void display(){
        System.out.println("\nName : "+emp_name+"\nEmployee Id : "+emp_num);
        System.out.println("\nBasic salary : "+basic);
        System.out.println("DA : "+da);
        System.out.println("Gross salary : "+gross);
        System.out.println("Income Tax : "+it);
        System.out.println("Net salary : "+net_sal);
    }
}
public class Qp2_L3 {
    public static void main(String args[]) {
        Employee emp= new Employee();
        emp.inputDetails();
        emp.calc();
        emp.display();
    }
}

/**
 * OUTPUT:
Enter empolyee ID:
101
Enter empolyee name:
Lothbrok
Enter basic salary:
1000

Name : Lothbrok      
Employee Id : 101    

Basic salary : 1000.0
DA : 520.0
Gross salary : 1520.0
Income Tax : 456.0   
Net salary : 1064.0  
*/
