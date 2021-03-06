/**
 * AUTHOR: Hridayan Phukan
 * DESCRIPTION: A Java Program to implement Eception Handling.
 */

import java.io.*;
public class Lab11_qp1{
    public static void main(String args[]){
        File infile = new File("input.txt");
        File outfile = new File("output.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try{
            ins = new FileReader(infile);
            outs = new FileWriter(outfile);
            int ch;
            while((ch = ins.read()) != -1){
                outs.write(ch);
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
        finally{
            try{
                ins.close();
                outs.close();
            }
            catch(IOException e){
                System.out.println("\nPlease Enter the correct String");
            }
        }
    }
}
