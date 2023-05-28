
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user input
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
        
            if (num < 0) {
                System.out.println("Error! Unsuitable number!");
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Result : " + (num * num));
            }
        }

    }
}
