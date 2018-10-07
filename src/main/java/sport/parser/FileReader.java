package sport.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by user on 03.10.2018
 */
public class FileReader {

    public static List<Passing> passings = new ArrayList<>();
    public static List<Rushing> rushings = new ArrayList<>();
    public static List<Receiving> receivings = new ArrayList<>();

    public static void parse(String txtFileName) {
        try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
            List<List<String>> values = stream.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
            for (int i = 0; i < values.size(); i++) {
                List<String> row = values.get(i);
                if (row.get(0).contains("Passing")) {

                    String teamName = Team.teams.get(row.get(0).substring(0, row.get(0).length() - 8).trim());
                    i = i+2;
                    row = values.get(i);
                    while (!row.get(0).equals("TEAM")) {
                        Passing passing = new Passing(row.get(0), teamName,
                                row.get(1).split("/")[0],
                                row.get(1).split("/")[1],
                                row.get(2), row.get(3), row.get(4), row.get(5), row.get(6).split("-")[0]);
                        passings.add(passing);
                        row = values.get(++i);
                    }
                }

                if (row.get(0).contains("Rushing")) {
                    String teamName = Team.teams.get(row.get(0).substring(0, row.get(0).length() - 8).trim());
                    i = i+2;
                    row = values.get(i);
                    while (!row.get(0).equals("TEAM")) {
                        Rushing rushing = new Rushing(row.get(0), teamName, row.get(1), row.get(2), row.get(3),
                                row.get(4), row.get(5));
                        rushings.add(rushing);
                        row = values.get(++i);
                    }
                }

                if (row.get(0).contains("Receiving")) {

                    String teamName = Team.teams.get(row.get(0).substring(0, row.get(0).length() - 10).trim());
                    i = i+2;
                    row = values.get(i);
                    while (!row.get(0).equals("TEAM")) {
                        Receiving receiving = new Receiving(row.get(0), teamName, row.get(1), row.get(2), row.get(3),
                                row.get(4), row.get(5), row.get(6));
                        receivings.add(receiving);
                        row = values.get(++i);
                    }
                }

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
