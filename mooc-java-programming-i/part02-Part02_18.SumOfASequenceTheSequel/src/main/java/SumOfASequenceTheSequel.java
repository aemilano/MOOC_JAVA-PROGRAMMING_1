
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Get user inputs
        System.out.println("Enter the first number of the closed range: ");
        int startVal = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the last number of the closed range: ");
        int endVal = Integer.valueOf(scanner.nextLine());

        // To store total
        int total = 0;
        // Iterative
        for (int i = startVal; i <= endVal; i++) {
            total += i;
        }

        // Output
        System.out.println("The sum of closed range : " + total);

    }
}
