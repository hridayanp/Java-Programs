/**
 * AUTOR: Hridayan Phukan
 * DESCRIPTION: A Java Program to calculate the area of rectangle, square and circle using Abstract Class.
*/

/**
 * ALGORITHM: 
 * We create an abstract class 'Shape' with one abstract methods namely display. 
 * We declare the parameters of Rectangle, Square and Circle class.
 * The methods of the three classes are inherited from the abstract methods of the Shape class.
 * We then create an object of all three class to call all the three methods and display their result, accordingly.
*/

import java.util.*;

abstract class Shape{
    abstract void inputData();
    abstract void display();
}
class Rectangle extends Shape{
    Scanner rect_input= new Scanner(System.in);
    int length, breadth;
    void inputData(){
        System.out.println("\nEnter length and breadth of Rectangle:");
        length= rect_input.nextInt();
        breadth= rect_input.nextInt();
    }
    void display(){
        System.out.println("\nArea of Rectangle: "+(length*breadth));
    }
}
class Square extends Shape{
    Scanner sqr_input= new Scanner(System.in);
    int side;
    void inputData(){
        System.out.println("\nEnter sides of Square:");
        side= sqr_input.nextInt();
    }
    void display(){
        System.out.println("\nArea of Square: "+(side*side));
    }
}
class Circle extends Shape{
    Scanner circle_input= new Scanner(System.in);
    int radius;
    void inputData(){
        System.out.println("\nEnter radius of Circle:");
        radius= circle_input.nextInt();
    }
    void display(){
        System.out.println("\nArea of Circle: "+(3.14*radius*radius));
    }
}
public class Lab9_qp1{
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("\nSelect a Shape");
            System.out.println("\n1.Rectangle\n2.Square\n3.Circle\n4.Exit");
            System.out.println("\nEnter choice:");
            int ch= input.nextInt();
            switch(ch){
                case 1: Rectangle rectObj= new Rectangle();
                        rectObj.inputData();
                        rectObj.display();
                        break;
                case 2: Square sqrObj= new Square();
                        sqrObj.inputData();
                        sqrObj.display();
                        break;
                case 3: Circle circleObj= new Circle();
                        circleObj.inputData();
                        circleObj.display();
                        break;
                case 4: System.out.println("Exitting");
                        System.exit(0);
                default: System.out.println("\nInvalid Choice");
                         break;
            }
        }
    }
}

/**
 * INPUT AND OUTPUT:
Select a Shape

1.Rectangle  
2.Square     
3.Circle     
4.Exit       

Enter choice:
1

Enter length and breadth of Rectangle:
1
2

Area of Rectangle: 2

Select a Shape      

1.Rectangle
2.Square
3.Circle
4.Exit

Enter choice:
2

Enter sides of Square:
2

Area of Square: 4

Select a Shape

1.Rectangle
2.Square
3.Circle
4.Exit

Enter choice:
3

Enter radius of Circle:
1

Area of Circle: 3.14

Select a Shape

1.Rectangle
2.Square
3.Circle
4.Exit

Enter choice:
4
Exitting
*/