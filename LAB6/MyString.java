/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: Java program to implement String class and methods.
*/

import java.util.*;
public class MyString{
    public static void main(String args[]) {
        String first="", second="";
        Scanner input= new Scanner(System.in);
        System.out.println("\nEnter first String:");
        first= input.nextLine();
        System.out.println("\nEnter second String:");
        second= input.nextLine();
        System.out.println("\nThe Strings entered are:\n"+first+"\n"+second);
        System.out.println("\nLength of the Strings are: "+first.length()+" and "+second.length()+" respectively ");
        if(first.compareTo(second)==0){
            System.out.println("\nBoth the Strings are of the same length");
        }
        else{
            System.out.println("\nBoth the Strings are not of the same length");
        }
        if(first.isEmpty()==true){
            System.out.println("\nFirst String is empty");
        }
        if(second.isEmpty()==true){
            System.out.println("\nSecond String is empty");
        }
        System.out.println("\nStrings in Upper Case are: \n"+first.toUpperCase()+"\n"+second.toUpperCase());
        String concatedString= first.concat(second);
        System.out.println("\nConcatenated String: "+concatedString);
        input.close();
    }
}

/**
 * OUTPUT:
Enter first String:
This is the first string

Enter second String:
This is the second string

The Strings entered are:
This is the first string
This is the second string

Length of the Strings are: 24 and 25 respectively 

Both the Strings are not of the same length

Strings in Upper Case are: 
THIS IS THE FIRST STRING
THIS IS THE SECOND STRING

Concatenated String: This is the first stringThis is the second string

*/