
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("")) {
                break;
            }

            String[] array = line.split(",");

            if (longestName.length() < array[0].length()) {
                longestName = array[0];
            }

            sum += Integer.valueOf(array[1]);
            count++;

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + ((double) sum / count));


    }
}
