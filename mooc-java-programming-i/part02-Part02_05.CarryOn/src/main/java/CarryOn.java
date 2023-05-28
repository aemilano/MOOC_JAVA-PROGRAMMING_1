
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask to terminate
            System.out.println("Shall we carry on?");

            if (scanner.nextLine().equals("no")) {
                break;
            }
        }
    }
}
