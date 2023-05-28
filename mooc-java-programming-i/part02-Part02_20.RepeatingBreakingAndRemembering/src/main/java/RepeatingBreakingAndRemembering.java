
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        // Prompt user
        System.out.println("Enter set of numbers : ");

        // Init vars
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;

        // Main program loop
        while (true) {
            // Get input
            int num = Integer.valueOf(scanner.nextLine());
            // Check for exit condition
            if (num == -1) {
                break;
            } else {
                sum += num;
                count++;
                // Check for even or odd
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        // Output
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((double) sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
