
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputString = scanner.nextLine();
            
            if (inputString.equals("")) {
                break;
            }

            String[] strArray = inputString.split(" ");

            for (String i : strArray) {
                System.out.println(i);
            } 
        }


    }
}
