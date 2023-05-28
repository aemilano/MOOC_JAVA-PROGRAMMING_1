
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;
        
        // Main program loop
        while (true) {
            System.out.println("Give a number:" );
            int num = Integer.valueOf(scanner.nextLine());

            // End conditional
            if (num == 0) {
                break;
            }
            
            total += num;
            count += 1;

        }

        // Get average
        double average = (double) total / count;

        System.out.println("Average of the numbers: " + average); 

    }
}
