
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inits vars
        /*
         * Vars used in loops must be initialized outside of the loop...
         * else they would go out of scope when the loops ends...
         */
        int count = 0;
        int num = 0;

        // Main loop
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num < 0) {

                count += 1;
            }
        }

        System.out.println("Number of negative numbers: " + count);

    }
}
