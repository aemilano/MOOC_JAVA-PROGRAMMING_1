
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to be squared ->");
        int num = Integer.valueOf(scanner.nextLine());

        int square = num * num;

        System.out.println("Result : " + square);

    }
}
