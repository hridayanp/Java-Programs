/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: Java program to implement StringBuffer class and methods.
*/

//import java.util.*;
public class MyStringBuffer {
    public static void main(String args[]) {
        //String str="";
        StringBuffer stringBuffer= new StringBuffer("This is a StringBuffer string ");
        // Scanner input= new Scanner(System.in);
        // System.out.println("\nEnter a String:");
        // str= input.nextLine();
        stringBuffer.append(" This is a second StringBuffer String");
        System.out.println("\nThe String entered is:\n"+stringBuffer);
        stringBuffer.insert(0, " This is an inserted StringBuffer String ");
        System.out.println("\nThe Inserted String is:\n"+stringBuffer);
        stringBuffer.reverse();
        System.out.println("\nThe Reversed String is:\n"+stringBuffer);
        //input.close();
    }
}

/**
 * OUTPUT:
The String entered is:
This is a StringBuffer string  This is a second StringBuffer String

The Inserted String is:
 This is an inserted StringBuffer String This is a StringBuffer string  This is a second StringBuffer String

The Reversed String is:
gnirtS reffuBgnirtS dnoces a si sihT  gnirts reffuBgnirtS a si sihT gnirtS reffuBgnirtS detresni na si sihT

*/
