                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                                        
                                                                               /*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithinInbuilt {

public static void main(String d[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    System.out.println("Enter search string ");
    String ss=sc.nextLine();
    if(s.contains(ss))
    {
       System.out.println(ss+ "word found");
    }
    else
    {
      System.out.println(ss+ "word not found");
     
    }
  }
  
}