package sport.parser;

/**
 * Created by user on 03.10.2018
 */
public class Passing {

    public String playerName;
    public String team;
    public String completions;
    public String attempts;
    public String yards;
    public String avg;
    public String touchdowns;
    public String interceptions;
    public String sacks;

    public Passing(String playerName,
                   String team,
                   String completions,
                   String attempts,
                   String yards,
                   String avg,
                   String touchdowns,
                   String interceptions,
                   String sacks) {
        this.playerName = playerName;
        this.team = team;
        this.attempts = attempts;
        this.yards = yards;
        this.avg = avg;
        this.touchdowns = touchdowns;
        this.interceptions = interceptions;
        this.sacks = sacks;
        this.completions = completions;
    }

    public void print() {
        System.out.println(playerName + " " + team + " " + completions + " " + attempts + " " + yards + " " + avg + " "
                + touchdowns + " " + interceptions + " " + sacks);
    }

    public String getInFormat() {
        return playerName + "," + team + "," + completions + "," + attempts + "," + yards + "," + touchdowns + ","
                + interceptions + "," + sacks;
    }

}
