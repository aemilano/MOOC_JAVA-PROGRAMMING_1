
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        // Main program loop
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            total += num;
            count += 1;
        }

        // Print output
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + total);

    }
}
