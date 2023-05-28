
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Init vars
        int begVal = Integer.valueOf(scanner.nextLine());

        // Init for loop
        for (int i = begVal; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
