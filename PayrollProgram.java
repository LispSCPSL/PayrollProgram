/* Tyler Dupree
* 8/15/24
*
* PayrollProgram.java
*
* Input: User's name, weekly hours worked, user's hourly payrate
*
* Processing: total weekly pay including overtime if more than 40 hours were worked that week.
*
* Output: Polite greeting to the user and regular pay and overtime pay
 */



import java.util.Scanner;


public class PayrollProgram {
    public static void main(String[] args) {
        System.out.println("\n\n...Welcome to the Payroll Program...\n");

        // Variables used in this program.
        String userName = "";
        int hoursWorked = 0;
        int anotherNumber;
        int overtimeHours;
        int payRate

        double hrlyPayRate = 0.0;
        double weeklyPay = 0.0;
        double overTimePay = 0.0;


        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a Scanner Object to get input from the user.

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

        // Create an output statement to the used echoing the user's input
        System.out.println("\n Hey " + userName + ", you have worked a total of: " + hoursWorked + " hours this week!");

        // Processing
        overtimeHours = hoursWorked - 40;
        if(hoursWorked>40) {
            overTimePay = overtimeHours * payRate * 1.5;
        }
        else {
                overTimePay = 0;
        }
        // Calculate weekly regular pay
        if (hoursWorked < 40){
            weeklyPay = hoursWorked


    }


