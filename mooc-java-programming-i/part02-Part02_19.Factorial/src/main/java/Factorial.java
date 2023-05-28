
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int inputNum = Integer.valueOf(scanner.nextLine());
        int factorialVal = 1;
        
        for (int i = 1; i <= inputNum; i++) {
            factorialVal *= i;
        }

        System.out.println("Factorial : " + factorialVal);

    }
}
