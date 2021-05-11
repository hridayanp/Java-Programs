/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to demonstrate Multiple Inheritance using an Account Class.
*/

import java.util.*;
class Account{
    int acc_no, acc_bal;
    String cust_name, acc_type;
    int total_trans=0;
    Scanner input= new Scanner(System.in);
    Account(){
        System.out.println("\nWelcome to the Bank.");
    }
    //public void info();
    void transact(){
        total_trans++;
    }
    void withdraw(){
        int withdraw;
        System.out.println("\nEnter the amount to withdraw: ");
        withdraw= input.nextInt();
        if(withdraw>acc_bal){
            System.out.println("\nSorry, Insufficient Balance!");
        }
        else if(withdraw<0){
            System.out.println("\nSorry, withdraw cannot be a negative value.");
        }
        else{
            acc_bal= acc_bal-withdraw;
            System.out.println("\nWithdraw Successful.\nNew Account Balance: "+acc_bal);
            transact();
        }
    }
    void deposit(){
        int deposit;
        System.out.println("\nEnter the amount to deposit: ");
        deposit= input.nextInt();
        if(deposit<0){
            System.out.println("\nSorry, deposit cannot be negative");
        }
        else{
            acc_bal= acc_bal+deposit;
            System.out.println("\nDeposit Successful.\nNew Account Balance: "+acc_bal);
            transact();
        }
    }
    void input(){
        System.out.print("\nEnter Customer Name : ");
        cust_name = input.next();
        System.out.print("Enter Account Number : ");
        acc_no = input.nextInt();
        System.out.print("Account Type : ");
        acc_type = input.next();
    }
    void display(){
        System.out.println("\nCustomer Name : "+cust_name);
        System.out.println("\nAccount Number : "+acc_no);
        System.out.println("\nAccount Type : "+acc_type);
        System.out.println("\nAccount Balance : "+acc_bal);
        System.out.println("\nTotal Transaction : "+total_trans);
    }
    void run(){
        while(true){
            int choice;
            System.out.println("\n1.Input\n2.Display\n3.Deposit\n4.Withdraw\n5.Exit");
            System.out.println("\nEnter the choice");
            choice= input.nextInt();
            if(choice==1){
                input();
            }
            else if(choice==2){
                display();
            }
            else if(choice==3){
                deposit();
            }
            else if(choice==4){
                withdraw();
            }
            else if(choice==5){
                break;
            }
            else{
                System.out.println("\nInvalid Input.");
            }
        }
    }
}

class S_Account extends Account{
    int s_trans_total=0;
    S_Account(){
        s_trans_total= s_trans_total+this.total_trans;
    }
    void info(){
        System.out.println("\nIn Savings Account: ");
    }
    void display(){
        System.out.println("\nCustomer Name : "+this.cust_name);
        System.out.println("\nAccount Number : "+this.acc_no);
        System.out.println("\nAccount Type : "+this.acc_type);
        System.out.println("\nAccount Balance : "+this.acc_bal);
        System.out.println("\nTotal Transaction : "+this.s_trans_total);
    }
}

class C_Account extends Account{
    int c_trans_total=0;
    C_Account(){
        c_trans_total= c_trans_total+this.total_trans;
    }
    void info(){
        System.out.println("\nIn Current Account: ");
    }
    void display(){
        System.out.println("\nCustomer Name : "+this.cust_name);
        System.out.println("\nAccount Number : "+this.acc_no);
        System.out.println("\nAccount Type : "+this.acc_type);
        System.out.println("\nAccount Balance : "+this.acc_bal);
        System.out.println("\nTotal Transaction : "+this.c_trans_total);
    }
}

public class L8_QP2 {
    public static void main(String args[]) {
        //Account obj;
        S_Account obj1= new S_Account();
        C_Account obj2= new C_Account();
        Scanner input2= new Scanner(System.in);
        int choice;
        System.out.println("\n1.Savings Account\n2.Current Account\n3.Exit\nEnter choice: ");
        choice= input2.nextInt();
        if(choice==1){
            obj1.run();
            obj1.display();
        }
        else if(choice==2){
            obj2.run();
            obj2.display();
        }
        else if(choice==3){
            System.exit(0);
        }
        else{
            System.out.println("\nInvalid choice");
        }
        input2.close();
    }
}

/**
 * OUTPUT:
Welcome to the Bank.

1.Savings Account   
2.Current Account   
3.Exit
Enter choice:       
1

1.Input
2.Display       
3.Deposit       
4.Withdraw      
5.Exit

Enter the choice
1

Enter Customer Name : HP
Enter Account Number : 101
Account Type : Savings

1.Input   
2.Display 
3.Deposit 
4.Withdraw
5.Exit    

Enter the choice
3

Enter the amount to deposit:
100

Deposit Successful.
New Account Balance: 100

1.Input
2.Display
3.Deposit
4.Withdraw
5.Exit

Enter the choice
4

Enter the amount to withdraw:
20

Withdraw Successful.
New Account Balance: 80

1.Input
2.Display
3.Deposit
4.Withdraw
5.Exit

Enter the choice
2

Customer Name : HP

Account Number : 101

Account Type : Savings

Account Balance : 80

Total Transaction : 0

1.Input
2.Display
3.Deposit
4.Withdraw
5.Exit

Enter the choice
5

Customer Name : HP

Account Number : 101

Account Type : Savings

Account Balance : 80

Total Transaction : 0
*/