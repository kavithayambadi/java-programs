/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 


//declare number variable

//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);


/*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/

import java.util.*;
  public class 22
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = in.nextInt();
        int years = days / 365;
        days = days - (365 * years);
        int months = days / 30;
        int d = days - (months * 30);
        
        System.out.println(years + " Years " + months + " Months " + d + " Days");
    }
}


//Declare switch case and check the input value to print the day entered by the user
    


