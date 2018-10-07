package sport.parser;

/**
 * Created by user on 03.10.2018
 */
public class Rushing {
    String playerName;
    String team;
    String attempts;
    String yards;
    String avg;
    String touchdowns;
    String longyardtot;

    public Rushing(String playerName, String team, String attempts, String yards, String avg, String touchdowns, String longyardtot) {
        this.playerName = playerName;
        this.team = team;
        this.attempts = attempts;
        this.yards = yards;
        this.avg = avg;
        this.touchdowns = touchdowns;
        this.longyardtot = longyardtot;
    }


    void print() {
        System.out.println(playerName + " " + team + " " + attempts + " " + yards + " " + avg + " "
                + touchdowns + " " + longyardtot);
    }

    public String getInFormat() {
        return playerName + "," + team + "," + attempts + "," + yards + "," + touchdowns + ","
                + longyardtot;
    }
}
