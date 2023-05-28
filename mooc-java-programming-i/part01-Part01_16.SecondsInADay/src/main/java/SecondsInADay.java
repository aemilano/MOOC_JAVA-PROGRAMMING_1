
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Get user input
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());

        // Calculate seconds
        int seconds = days * 24 * 60 * 60;

        // Output
        System.out.println(seconds);

    }
}
