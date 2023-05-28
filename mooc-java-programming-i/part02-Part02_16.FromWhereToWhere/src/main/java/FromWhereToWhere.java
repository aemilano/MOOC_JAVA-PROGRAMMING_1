
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Store user inputs
        System.out.println("Where to?");
        int endVal = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int begVal = Integer.valueOf(scanner.nextLine());

        if (begVal <= endVal) {
            for (int i = begVal; i <= endVal; i++) {
                System.out.println(i);
            }
        }
    }
}
