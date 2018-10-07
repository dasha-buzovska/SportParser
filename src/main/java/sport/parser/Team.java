package sport.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03.10.2018
 */
public class Team {
    public static Map<String, String> teams = new HashMap<>();

    static {
        teams.put("Kansas City", "KAN");
        teams.put("Denver", "DEN");
        teams.put("Cincinnati", "CIN");
        teams.put("Atlanta", "ATL");
        teams.put("Indianapolis", "IND");
        teams.put("New England", "NEW");
    }
}
