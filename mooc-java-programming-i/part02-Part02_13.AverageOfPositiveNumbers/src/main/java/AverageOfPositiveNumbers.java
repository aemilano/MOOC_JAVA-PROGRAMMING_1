
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        System.out.println("Enter some numbers : ");
        // Main program loop
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                total += num;
                count += 1;
            }
        }

        // Calculate average
        if (total != 0) {
            double average = (double) total / count;
            System.out.println("Average : " + average);
        } else {
            System.out.println("Error! Cannot calculate average!");
        }

    }
}
