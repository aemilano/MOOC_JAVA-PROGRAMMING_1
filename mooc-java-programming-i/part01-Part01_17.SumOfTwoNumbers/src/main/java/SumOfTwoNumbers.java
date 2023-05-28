
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Get input numbers
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        // Add together and Print to console
        System.out.println("The sum of the numbers is " + (firstNum + secondNum));

    }
}
