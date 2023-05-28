
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        ArrayList<Team> teamList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();

        teamList = importData(file);

        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        for (Team i : teamList) {
            if (i.getName().equals(teamName)) {
                games = i.getGamesPlayed();
                wins = i.getWins();
                losses = i.getLosses();
                break;
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

    public static ArrayList<Team> importData(String file) {
        ArrayList<Team> list = new ArrayList<>();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                
                String[] line = fileScan.nextLine().split(",");
                String teamOneName = line[0];
                String teamTwoName = line[1];
                int teamOneScore = Integer.valueOf(line[2]);
                int teamTwoScore = Integer.valueOf(line[3]);
                boolean teamOneExists = false;
                boolean teamTwoExists = false;

                for (Team i : list) {
                    if (i.getName().equals(teamOneName)) {
                        
                        if (teamOneScore > teamTwoScore) {
                            i.setWins();
                        } else {
                            i.setLosses();
                        }

                        teamOneExists = true;
                        continue;
                    
                    }
                    
                    if (i.getName().equals(teamTwoName)) {
                        
                        if (teamTwoScore > teamOneScore) {
                            i.setWins();
                        } else {
                            i.setLosses();
                        }

                        teamTwoExists = true;
                        continue;

                    }
                }

                if (!teamOneExists) {
                    if (teamOneScore > teamTwoScore) {
                        list.add(new Team(teamOneName, true));
                    
                    } else {
                        list.add(new Team(teamOneName, false));
                    }
                }

                if (!teamTwoExists) {
                    if (teamTwoScore > teamOneScore) {
                        list.add(new Team(teamTwoName, true));
                    
                    } else {
                        list.add(new Team(teamTwoName, false));
                    }
                }
            }
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return list;
    }
}
