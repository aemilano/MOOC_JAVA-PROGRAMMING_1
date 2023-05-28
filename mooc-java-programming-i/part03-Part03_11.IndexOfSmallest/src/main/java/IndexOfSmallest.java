
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 9999) {
                break;
            }

            numberList.add(num);
        }

        int smallest = 9999;

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) <= smallest) {
                smallest = numberList.get(i);
            }
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) == smallest) {
                System.out.println("Found index: " + i);
            }
        }
    }
}
