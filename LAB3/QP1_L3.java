/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java program to define a class Bank and use static functions to demonstrate withdraw or deposit.
*/

import java.util.*;
class Bank{
    String acc_name, acc_type;
    int acc_no, acc_balance;
    Scanner input= new Scanner(System.in);
    static int transaction=0;

    static void transact(){
        transaction++;
    }
    void inptDetails(){
        System.out.println("Enter name:");
        acc_name= input.next();
        System.out.println("Enter account number:");
        acc_no= input.nextInt();
        System.out.println("Enter account type:");
        acc_type= input.next();
        System.out.println("Enter current balance:");
        acc_balance= input.nextInt();
    }
    void deposit(){
        int deposit;
        System.out.println("Enter amount to deposit:");
        deposit= input.nextInt();
        if(deposit<0){
            System.out.println("Invalid deposit amount");
        }
        else{
            acc_balance= acc_balance+deposit;
            System.out.println("Deposit successful.\nAccount balance: "+acc_balance);
            transact();
        }
    }
    void withdraw(){
        int withdraw;
        System.out.println("Enter amount to withdraw:");
        withdraw= input.nextInt();
        if(withdraw>acc_balance){
            System.out.println("Insufficient funds!!!");
        }
        else if(withdraw<0){
            System.out.println("Invalid withdraw amount");
        }
        else{
            acc_balance= acc_balance-withdraw;
            System.out.println("Withdraw successful.\nAccount balance: "+acc_balance);
            transact();
        }
    }
    void display(){
        System.out.println("\nAccount Name : "+acc_name);
        System.out.println("Account Number : "+acc_no);
        System.out.println("Account Type : "+acc_type);
        System.out.println("Current Balance : "+acc_balance);
        System.out.println("Total Transactions : "+transaction);
    }
}
public class QP1_L3{
    public static void main(String args[]) {
        Bank obj= new Bank();
        int choice, flag=1;
        Scanner ch= new Scanner(System.in);
        while(flag==1){
            System.out.println("\n1.Input Details\n2.Display\n3.Deposit\n4.Withdraw\n5.Exit\n");
            choice= ch.nextInt();
            if(choice==1){
                obj.inptDetails();
            }
            else if(choice==2){
                obj.display();
            }
            else if(choice==3){
                obj.deposit();
            }
            else if(choice==4){
                obj.withdraw();
            }
            else if(choice==5){
                break;
            }
            else{
                System.out.println("Invaid Option");
            }
        }
        ch.close();
    }
}

/**
 * OUTPUT:
1.Input Details
2.Display      
3.Deposit      
4.Withdraw     
5.Exit

1
Enter name:
Hridayan
Enter account number:
101
Enter account type:
Debit
Enter current balance:
1000

1.Input Details
2.Display
3.Deposit
4.Withdraw
5.Exit

2

Account Name : Hridayan
Account Number : 101
Account Type : Debit
Current Balance : 1000
Total Transactions : 0

1.Input Details
2.Display
3.Deposit
4.Withdraw
5.Exit

3
Enter amount to deposit:
150
Deposit successful.
Account balance: 1150

1.Input Details
2.Display
3.Deposit
4.Withdraw
5.Exit

2

Account Name : Hridayan
Account Number : 101
Account Type : Debit
Current Balance : 1150
Total Transactions : 1

1.Input Details
2.Display
3.Deposit
4.Withdraw
5.Exit

4
Enter amount to withdraw:
50
Withdraw successful.
Account balance: 1100

1.Input Details
2.Display
3.Deposit
4.Withdraw
5.Exit

5
 */