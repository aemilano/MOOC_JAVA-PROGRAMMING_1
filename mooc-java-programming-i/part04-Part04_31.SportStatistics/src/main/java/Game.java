public class Game {

    private String homingTeam = "";
    private String visitingTeam = "";
    private int homingPoints = 0;
    private int visitingPoints = 0;
    private String victor = "";

    public Game(String homeName, String visitingName, int homePoints, int visitPoints) {
        this.homingTeam = homeName;
        this.visitingTeam = visitingName;
        this.homingPoints = homePoints;
        this.visitingPoints = visitPoints;
        this.victor = this.setVictor();
    }

    public String setVictor() {
        if (this.homingPoints > this.visitingPoints) {
            return this.homingTeam;
        
        } else {
            return this.visitingTeam;
        }
    }

    public String getVictor() {
        return this.victor;
    }

    public String getLoser() {
        if (this.victor.equals(homingTeam)) {
            return this.visitingTeam;
        
        } else {
            return this.homingTeam;
        }
    }

    public String toString() {
        return (this.homingTeam + " " + this.homingPoints + " - " + this.visitingPoints + " " + this.visitingTeam);
    }
}
