
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Game> gameArray = new ArrayList<>();

        System.out.println("File:");
        String fileName = scanner.nextLine();

        gameArray = readFile(fileName);

        if (gameArray.isEmpty()) {
            scanner.close();
            return;
        }

        System.out.println("Team:");
        String team = scanner.nextLine();

        scanner.close();

        int gamesplayed = 0;
        int wins = 0;
        int losses = 0;

        for (Game i : gameArray) {
            if (team.equals(i.getVictor())) {
                gamesplayed++;
                wins++;
            
            } else if (team.equals(i.getLoser())) {
                gamesplayed++;
                losses++;
            }
        }

        System.out.println("Games: " + gamesplayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

    public static ArrayList<Game> readFile(String fileName) {
        ArrayList<Game> gameList = new ArrayList<>();
        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                
                String[] line = fileScan.nextLine().split(",");

                int homePoints = Integer.valueOf(line[2]);
                int visitPoints = Integer.valueOf(line[3]);

                gameList.add(new Game(line[0], line[1], homePoints, visitPoints));
            }
        
        } catch (Exception e) {
            System.out.println("Error: File read failed, File: " + e.getMessage());
        }

        return gameList;
    }
}