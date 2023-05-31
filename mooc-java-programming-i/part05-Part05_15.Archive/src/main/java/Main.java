
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> inventory = new ArrayList<>();

        while (true) {
            System.out.print("Identifier? ");
            String identifier = scanner.nextLine();
            
            if (identifier.equals("")) {
                break;
            }

            System.out.print("Name? ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println();

            Item tempItem = new Item(name, identifier);
            if (!(inventory.contains(tempItem))) {
                inventory.add(tempItem);
            } 
        }

        for (Item i : inventory) {
            System.out.println(i);
        }


    }
}
