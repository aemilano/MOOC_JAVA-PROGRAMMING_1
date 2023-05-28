
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfOldest = "";

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            String[] array = line.split(",");

            if (oldestAge < Integer.valueOf(array[1])) {
                oldestAge = Integer.valueOf(array[1]);
                nameOfOldest = array[0];
            }
        }

        System.out.println("Name of the Oldest: " + nameOfOldest);
    }
}
