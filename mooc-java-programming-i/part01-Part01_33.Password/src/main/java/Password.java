
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        String password = "Caput Draconis";
        System.out.println("Password?");
        String attempt = scan.nextLine();

        if (attempt.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}