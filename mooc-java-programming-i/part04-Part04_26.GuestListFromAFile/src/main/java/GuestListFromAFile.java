
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner userScan = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = userScan.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            
            while(fileScan.hasNextLine()) {
                list.add(fileScan.nextLine());
            }
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {

            String name = userScan.nextLine();

            if (name.equals("")) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
