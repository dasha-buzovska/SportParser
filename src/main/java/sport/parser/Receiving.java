package sport.parser;

/**
 * Created by user on 03.10.2018
 */
public class Receiving {
    String playerName;
    String team;
    String receptions;
    String yards;
    String avg;
    String touchdowns;
    String longyardtot;
    String targets;

    public Receiving(String playerName, String team, String receptions, String yards, String avg, String touchdowns,
                     String longyardtot, String targets) {
        this.playerName = playerName;
        this.team = team;
        this.receptions = receptions;
        this.yards = yards;
        this.avg = avg;
        this.touchdowns = touchdowns;
        this.longyardtot = longyardtot;
        this.targets = targets;
    }

    void print() {
        System.out.println(playerName + " " + team + " " + receptions + " " + yards + " " + avg + " "
                + touchdowns + " " + longyardtot + " " + targets);
    }

    public String getInFormat() {
        return playerName + "," + team + "," + receptions + "," + yards + "," + touchdowns + ","
                + longyardtot + "," + targets;
    }
}
