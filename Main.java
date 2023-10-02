
import java.util.Scanner;

/**
* Create a program that will calculate the weekly average tax withholding for a customer given the following weekly income guidelines
*   1. Get the customer's weekly income from user
*   2. Check if the customer's income is within a certain range and set the tax rate:
*     - If customer's income is less than $500, Set tax rate to 10%
*     - Else if customer's income is greater than or equal to $500 and less than $1500, Set tax rate to 15%
*     - Else if customer's income is greater than or equal to $1500 and less than $2500, Set tax rate to 20%
*     - Else if customer's income is greater than or equal to $2500, Set tax rate to 30%
*   3. Calculate the customer's weekly tax withoholding: customer_income * tax_rate = tax_withholding
*   4. Display the customer's tax withholding to the screen
*/
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double weeklyIncome;
    double taxRate = 0.0;
    double taxWithholding;

    // Get the customer's weekly income from user
    System.out.println("Enter the customer's weekly income");
    weeklyIncome = scanner.nextDouble();

    // Check the customer's income and set the tax rate.
    if (weeklyIncome < 500) {
      taxRate = 0.10;
    } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
      taxRate = 0.15;
    } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
      taxRate = 0.20;
    } else if (weeklyIncome >= 2500) {
      taxRate = 0.30;
    }

    // Calculate the tax withholding
    taxWithholding = weeklyIncome * taxRate;

    // Display the customer's tax withholding to the screen
    System.out.printf("The customer's weekly tax withholding is $%.2f", taxWithholding);
  }
}