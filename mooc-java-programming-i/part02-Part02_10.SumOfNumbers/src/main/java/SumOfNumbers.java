
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Init Vars
        int total = 0;
        int num = 0;

        // Main program loop
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            total += num;

        }

        // Print output
        System.out.println("Sum of the numbers: " + total);

    }
}
