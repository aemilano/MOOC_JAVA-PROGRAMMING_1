public class Team {
    private String name = "";
    private int gamesPlayed = 0;
    private int wins = 0;
    private int losses = 0;

    public Team(String teamName, boolean victory) {
        this.name = teamName;
        
        if (victory) {
            this.setWins();
        } else {
            this.setLosses();
        }
    }

    public void setWins() {
        this.wins++;
        this.gamesPlayed++;
    }

    public void setLosses() {
        this.losses++;
        this.gamesPlayed++;
    }

    public String getName() {
        return this.name;
    }

    public int getGamesPlayed() {
        return this.gamesPlayed;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public String toString() {
        return (this.name + ", Games: " + this.gamesPlayed + ", Wins: " + this.wins + ", Losses: " + this.losses);
    }
}
