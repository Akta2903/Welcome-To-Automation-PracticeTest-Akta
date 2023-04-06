package automationtest;

import java.util.Scanner;

/**
 * 3.1 Create the class with the name "IfThenElse_Q3"
 * 3.2 Create a method with the name "isTeen" with a boolean return type and one parameter with type int and name "age".
 * 3.3 Write the logic into the "isTeen" method. if the age is less than or equal to 18 then return 'true'
 *     else return 'false'.
 * 3.4 Create the main method
 * 3.5 Create the Object and call the 'isTeen' method inside the sout statement.
 *
 * Output
 * 15  - true
 * 25  - false
 */
public class IfThenElse_Q3
{
    public boolean isTeen(int age) // 3.2 declaring instance method
    {
        //logic for 3.3
        if(age<=18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) //3.4 declaring main method
    {
        // Declaring Scanner to read an input from the console
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = scan.nextInt(); // reading an input
         IfThenElse_Q3 obj = new IfThenElse_Q3(); // 3.5 object creation
        System.out.println(age + " - " + obj.isTeen(age)); //3.5 calling a isTeen()
        scan.close(); // Scanner closing
    }

}
