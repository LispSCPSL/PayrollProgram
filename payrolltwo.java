


import java.util.Scanner;


public class payrolltwo {

    static void theHelloMethod(){
        System.out.println("\n Hello from theHelloMethod() ");
    }

    // Create a method that gets input.
    // This is the method's definition.
    static void aPersonalGreeting(String someName) {
        System.out.println("\n Hello " + someName + " how are you today?");
    }

    // Create a method that gets two integers and returns their sum.
    // Create two int parameters
    static int sumTwoInts(int num1, int num2){
        int mySum = 0;
        mySum = num1 + num2;

        return mySum;

}


    public static void main(String[] args) {
        System.out.println("\n Welcome to Methods! \n");


        // Variables (members)
        String theUserName = "";

        // Create a Scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // get the user's name
        System.out.println("\n Please enter your name: ");
        theUserName = scanner.nextLine();

        // Call (invoke) our greeting method.
        aPersonalGreeting(theUserName);

        theHelloMethod();

        // variable.
        int aSum = 0;

        // Call our new sum method
        aSum = sumTwoInts(3, 4);

        System.out.println("\n aSm is: " + aSum);

        System.out.println("\n This is the end of my program");



        // Variables used in this program.
        String userName = "";
        int hoursWorked = 0;
        int overtimeHours = 0;
        int payRate = 0;

        double hrlyPayRate = 16.5;
        double weeklyPay = 0.0;
        double overtimePay = 0.0;

        // Get information from the user, such as their name, pay hours, etc.

        Scanner myScannerObject = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObject.nextLine();

        System.out.println("\n Hello " + userName + ", and welcome to the Payroll Program!");

        // Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println("\n Please enter the total amount of hours you have worked this week. \n (Make sure to use whole numbers)");
        // Use the scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in a variable
        hoursWorked = myScannerObject.nextInt();

        System.out.println("\n Please enter your hourly pay rate: ");
        payRate = myScannerObject.nextInt();

        // Create an output statement to the used echoing the user's input
        System.out.println("\n Hey " + userName + ", you have worked a total of: " + hoursWorked + " hours this week!");

        if (hoursWorked > 40) {
            weeklyPay = hrlyPayRate * hoursWorked;
        }

        if (hoursWorked < 40) {
            System.out.println("\n You will receive Overtime pay with hours exceeding 40");
        }

        if (hoursWorked < 40) {
            overtimePay = overtimeHours * payRate * 1.5;
        }
        else {
                overtimePay = 0;
        }












    }
}