import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bookName = scanner.nextLine();

            if (bookName.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Books(bookName, numPages, pubYear));
        }

        System.out.print("What information will be printed? ");
        String outputChoice = scanner.nextLine();

        for (Books i : bookList) {
            if (outputChoice.equals("everything")) {
                System.out.println(i);
            } else if (outputChoice.equals("name")) {
                System.out.println(i.getName());
            }
        }
    }
}