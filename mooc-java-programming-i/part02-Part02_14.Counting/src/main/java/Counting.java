
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        int endVal = Integer.valueOf(scanner.nextLine());

        // Init For Loop
        for (int i = 0; i <= endVal; i++) {
            System.out.println(i);
        }

    }
}
