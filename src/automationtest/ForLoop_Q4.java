package automationtest;

import java.util.Scanner;

/**
 * 4.1 Create the class with the name "ForLoop_Q4"
 * 4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
 * 4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
 * 4.4	Create the main method
 * 4.5 Create the Object and call the 'printMyName' method into the main method.
 *
 * Output
 * howManyTime = 10 it will print your name 10 times
 * howManyTime = 15 it will print your name 15 times
 */

public class ForLoop_Q4
{
       public void printMyName(String name , int howManyTime) //4.2 declaring printMyName()
       {
              //4.3 logic to print name as per the user unput
           for(int i=0;i<howManyTime;i++)
           {
                  System.out.println("My name : " + name);
           }
       }

       public static void main(String[] args) //4.4 declaring main method
       {
              //Declaring scanner to read an input from the console
              Scanner scan = new Scanner(System.in);
              System.out.print("Enter the name you want to print : ");
              String name = scan.next(); // reading an input name
              System.out.print("How many times you want to print : ");
              int howManyTime = scan.nextInt(); // reading an input
              ForLoop_Q4 obj = new ForLoop_Q4(); // 4.5 Create an object
              obj.printMyName(name , howManyTime); //4.5 calling printMyName()
              scan.close(); // scanner closing
       }
}
