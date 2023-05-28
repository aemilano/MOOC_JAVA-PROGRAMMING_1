
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer below...");
        int num = Integer.valueOf(scanner.nextLine());

        // Conditional
        if (num < 0) {
            num *= -1;
        }

        // Output
        System.out.println("Result : " + num);

    }
}
