package automationtest;

/**
 * 2.1 Create the class with the name "Variable_Q2"
 * 2.2 Declare two global variables with the name "id" and "name" with int and string type.
 * 2.3 Create a parameterized Constructor That assigns the value of the above two variables.
 * 2.4 Create a method with no return type and no parameter with the name "display" and write a SOUT statement to print the value of the above variables.
 * 2.5 Create the main method
 * 2.6 Create the Object with the name obj1 and pass the value '101', 'YourName'
 * 2.7 Call the 'display method into the main method with obj1.
 * 2.8 Create the second Object with the name obj2 and pass the value '102', 'Prime'
 * 2.9 Call the 'display method into the main method with obj2.
 * Output
 * 101 - YourName
 * 102 - Prime
 */
public class Variable_Q2
{
    int id; //2.2 creating global variable
    String name;//2.2 creating global variable
    public Variable_Q2(int id , String name) //2.3 declaring parameterized Constructor
    {
        this.id = id; //2.3 assigning the value to global variable
        this.name = name;//2.3 assigning the value to global variable
    }
    public void display() //2.4 declaring an instance variable
    {
        System.out.println(id + " - " +  name); // 2.4 to print the value of above variables
    }

    public static void main(String[] args) //2.5 declaring main method
    {
        Variable_Q2 obj1 = new Variable_Q2(101,"Akta"); // 2.6 creating an object
        obj1.display(); // 2.7 calling display()
        Variable_Q2 obj2 = new Variable_Q2(102,"Prime"); //2.8 creating an object
        obj2.display(); // 2.9 calling display()
    }
}
