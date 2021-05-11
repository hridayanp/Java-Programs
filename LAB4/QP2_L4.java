/*
    * AUTHOR: Hridayan Phukan
    * DESCRIPTION: A Java program to implement Stack operations. 
*/

import java.util.*;
class Stack{
    int arr[], top, capacity;
    Stack(int size){
        top= -1;
        capacity= size;
        arr= new int[size];
    }
    Boolean isEmpty(){
        return top==-1;
    }
    Boolean isFull(){
        return top== capacity-1;
    }
    int size(){
        return top+1;
    }
    void push(int x){
        if(isFull()){
            System.out.println("Overflow\nProgram Terminating...");
            System.exit(1);
        }
        System.out.println("Pushing "+x);
        arr[++top]=x;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminating...");
            System.exit(1);
        }
        System.out.println("Poping "+arr[top]);
        return arr[top--];
    }
    void display(){
        if(top>=0){
            System.out.println("\nStack elements are:");
            for(int i=top; i>=0; i--){
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println("Stack is empty.");
        }
    }
}
public class QP2_L4 {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        int choice;
        Stack ob1= new Stack(10);
        while(true){
            System.out.println("\nChoose an option:");
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
            choice= input.nextInt();
            switch(choice){
                case 1: System.out.println("Enter element to push:");
                        ob1.push(input.nextInt());
                        break;
                case 2: System.out.println("Element popped: "+ob1.pop());
                        break;
                case 3: ob1.display();
                        break;
                case 4: System.exit(1);
                        input.close();
                default: System.out.println("Invalid choice");
                         break;
            }
        }
    }
}

/**
 * OUTPUT:

Choose an option:
1.Push   
2.Pop    
3.Display
4.Exit   
1
Enter element to push:
10
Pushing 10       

Choose an option:
1.Push
2.Pop
3.Display        
4.Exit
1
Enter element to push:
20
Pushing 20       

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
1
Enter element to push:
30
Pushing 30

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
1
Enter element to push:
40
Pushing 40

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
3

Stack elements are:
40
30
20
10

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
2
Poping 40
Element popped: 40

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
3

Stack elements are:
30
20
10

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
2
Poping 30
Element popped: 30

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
3

Stack elements are:
20
10

Choose an option:
1.Push
2.Pop
3.Display
4.Exit
4

*/