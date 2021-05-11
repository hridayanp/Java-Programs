/**
 * AUTOR: Hridayan Phukan
 * DESCRIPTION: A Java Program to implement Bank functionalities using Abstract Class.
*/
/**
 * ALGORITHM:
 * We create an abstract class 'Bank' with an abstract methods 'withdraw', 'deposit' and 'getBalance'. 
 * We create three sub-classes BankA, BankB ans BankC respectively.
 * Funds in the banks are initialized as Rs.10000, Rs. 15000 and Rs.20000 in banks A, B and C respectively.  
 * We call the methods of sub-classes by creating an object of each of the three classes.
 * We then display the results accordingly. 
*/

import java.util.*;
abstract class Bank{
    abstract void withdraw();
    abstract void deposit();
    abstract void getBalance();
}
class BankA extends Bank{
    Scanner input= new Scanner(System.in);
    int balance= 10000;
    int withdraw, deposit;
    void withdraw(){
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw= input.nextInt();
        if(withdraw>balance){
            System.out.println("\nSorry, Insufficient Balance!");
        }
        else if(withdraw<0){
            System.out.println("\nSorry, withdraw cannot be a negative value.");
        }
        else{
            balance= balance-withdraw;
            System.out.println("\nWithdraw Successful.\nNew Account Balance: "+balance);
        }
    }
    void deposit(){
        System.out.println("\nEnter the amount to deposit: ");
        deposit= input.nextInt();
        if(deposit<0){
            System.out.println("\nSorry, deposit cannot be negative");
        }
        else{
            balance= balance+deposit;
            System.out.println("\nDeposit Successful.\nNew Account Balance: "+balance);
        }
    }
    void getBalance(){
        System.out.println("Balance in BankA: "+balance);
    }
    void run(){
        while(true){
            int choice;
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            System.out.println("\nEnter the choice:");
            choice= input.nextInt();
            if(choice==1){
                deposit();
            }
            else if(choice==2){
                withdraw();
            }
            else if(choice==3){
                getBalance();
            }
            else if(choice==4){
                System.exit(0);
            }
            else{
                System.out.println("\nInvalid Input.");
            }
        }
    }
}
class BankB extends Bank{
    Scanner input= new Scanner(System.in);
    int balance= 15000;
    int withdraw, deposit;
    void withdraw(){
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw= input.nextInt();
        if(withdraw>balance){
            System.out.println("\nSorry, Insufficient Balance!");
        }
        else if(withdraw<0){
            System.out.println("\nSorry, withdraw cannot be a negative value.");
        }
        else{
            balance= balance-withdraw;
            System.out.println("\nWithdraw Successful.\nNew Account Balance: "+balance);
        }
    }
    void deposit(){
        System.out.println("\nEnter the amount to deposit: ");
        deposit= input.nextInt();
        if(deposit<0){
            System.out.println("\nSorry, deposit cannot be negative");
        }
        else{
            balance= balance+deposit;
            System.out.println("\nDeposit Successful.\nNew Account Balance: "+balance);
        }
    }
    void getBalance(){
        System.out.println("Balance in BankB: "+balance);
    }
    void run(){
        while(true){
            int choice;
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            System.out.println("\nEnter the choice:");
            choice= input.nextInt();
            if(choice==1){
                deposit();
            }
            else if(choice==2){
                withdraw();
            }
            else if(choice==3){
                getBalance();
            }
            else if(choice==4){
                System.exit(0);
            }
            else{
                System.out.println("\nInvalid Input.");
            }
        }
    }
}
class BankC extends Bank{
    Scanner input= new Scanner(System.in);
    int balance= 20000;
    int withdraw, deposit;
    void withdraw(){
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw= input.nextInt();
        if(withdraw>balance){
            System.out.println("\nSorry, Insufficient Balance!");
        }
        else if(withdraw<0){
            System.out.println("\nSorry, withdraw cannot be a negative value.");
        }
        else{
            balance= balance-withdraw;
            System.out.println("\nWithdraw Successful.\nNew Account Balance: "+balance);
        }
    }
    void deposit(){
        System.out.println("\nEnter the amount to deposit: ");
        deposit= input.nextInt();
        if(deposit<0){
            System.out.println("\nSorry, deposit cannot be negative");
        }
        else{
            balance= balance+deposit;
            System.out.println("\nDeposit Successful.\nNew Account Balance: "+balance);
        }
    }
    void getBalance(){
        System.out.println("Balance in BankC: "+balance);
    }
    void run(){
        while(true){
            int choice;
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            System.out.println("\nEnter the choice:");
            choice= input.nextInt();
            if(choice==1){
                deposit();
            }
            else if(choice==2){
                withdraw();
            }
            else if(choice==3){
                getBalance();
            }
            else if(choice==4){
                System.exit(0);
            }
            else{
                System.out.println("\nInvalid Input.");
            }
        }
    }
}
public class Lab9_qp2 {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("\n1.BankA\n2.BankB\n3.BankC\n4.Exit");
            System.out.println("\nEnter choice of Bank:");
            int choice= input.nextInt();
            switch(choice){
                case 1: BankA obj1= new BankA();
                        obj1.run();
                case 2: BankA obj2= new BankA();
                        obj2.run();
                        break;
                case 3: BankA obj3= new BankA();
                        obj3.getBalance();
                        break;
                case 4: System.out.println("\nExitting");
                        System.exit(0);
                default: System.out.println("\nInvalid choice");
                         System.exit(0);
            }
        }
    }
}

/**INPUT AND OUTPUT:
1.BankA
2.BankB
3.BankC
4.Exit 

Enter choice of Bank:
1

1.Deposit        
2.Withdraw       
3.Display        
4.Exit

Enter the choice:
1

Enter the amount to deposit: 
4000

Deposit Successful.       
New Account Balance: 14000

1.Deposit
2.Withdraw
3.Display
4.Exit

Enter the choice:
2

Enter the amount to withdraw:
400

Withdraw Successful.
New Account Balance: 13600

1.Deposit
2.Withdraw
3.Display
4.Exit

Enter the choice:
3
Balance in BankA: 13600

1.Deposit
2.Withdraw
3.Display
4.Exit

Enter the choice:
4
Exitting
*/
