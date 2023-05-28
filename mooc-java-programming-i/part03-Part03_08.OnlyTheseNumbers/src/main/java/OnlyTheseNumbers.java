
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("Where from?");
        int rangeStart = Integer.valueOf(scanner.nextLine());
        System.out.println("Where to?");
        int rangeEnd = Integer.valueOf(scanner.nextLine());

        for (int i = rangeStart; i <= rangeEnd; i++) {
            System.out.println(numbers.get(i));
        }

    }
}
