
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of gift : ");
        int giftVal = Integer.valueOf(scan.nextLine());

        // Calculate gift tax
        if (giftVal < 5000) {
            System.out.println("No Tax!");
        } else if (giftVal < 25000) {
            System.out.println("Tax : " + (100 + (giftVal - 5000) * 0.08));
        } else if (giftVal < 55000) {
            System.out.println("Tax : " + (1700 + (giftVal - 25000) * 0.10));
        } else if (giftVal < 200000) {
            System.out.println("Tax : " + (4700 + (giftVal - 55000) * 0.12));
        } else if (giftVal < 1000000) {
            System.out.println("Tax : " + (22100 + (giftVal - 200000) * 0.15));
        } else {
            System.out.println("Tax : " + (142100 + (giftVal - 1000000) * 0.17));
        }
    }
}
