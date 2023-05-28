
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the last number : ");
        int endVal = Integer.valueOf(scanner.nextLine());
        int total = 0;

        for (int i = 1; i <= endVal; i++) {
            total += i;
        }

        System.out.println("The sum is " + total);

    }
}
