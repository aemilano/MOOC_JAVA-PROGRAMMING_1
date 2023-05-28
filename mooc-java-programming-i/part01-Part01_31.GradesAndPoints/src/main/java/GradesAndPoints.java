
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        String outcome = "";

        if (grade < 0) {
            outcome = "Impossible";
        } else if (grade < 50) {
            outcome = "Fail";
        } else if (grade <= 59) {
            outcome = "1";
        } else if (grade <= 69) {
            outcome = "2";
        } else if (grade <= 79) {
            outcome = "3";
        } else if (grade <= 89) {
            outcome = "4";
        } else if (grade <= 100) {
            outcome = "5";
        } else {
            outcome = "Incredible";
        }

        System.out.println("Grade: " + outcome);

    }
}
