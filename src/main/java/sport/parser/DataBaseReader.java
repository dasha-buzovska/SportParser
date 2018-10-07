package sport.parser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by user on 03.10.2018
 */
public class DataBaseReader {

    public static Map<String, String> parse(String fileName) throws  Exception {
        Map<String, String> players = new HashMap<>();
        Stream<String> stream = Files.lines(Paths.get(fileName));
        stream.forEach(row -> {
            row = row.replaceAll("\"","");
            row = row.replaceAll("QB,","");
            row = row.replaceAll("RB,","");
            row = row.replaceAll("FB,","");
            row = row.replaceAll("WR,","");
            row = row.replaceAll("TE,","");
            row = row.replaceAll("\\(","");
            row = row.replaceAll("\\)","");
            String[] cells = row.split(",");
            players.put(cells[1], row.substring(row.indexOf(",") + 1));
        });
        return players;
    }

}
