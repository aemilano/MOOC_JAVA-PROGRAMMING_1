
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;

        while (true) {
            String inputString = scanner.nextLine();

            if (inputString.equals("")) {
                break;
            }

            String[] array = inputString.split(",");

            if (oldestAge < Integer.valueOf(array[1])) {
                oldestAge = Integer.valueOf(array[1]);
            }
        }

        System.out.println("Age of the Oldest: " + oldestAge);

    }
}
