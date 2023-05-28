
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers below...");
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());

        double sqRoot = Math.sqrt(firstNum + secondNum);

        System.out.println("Result : " + sqRoot);

    }
}
