package sport.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03.10.2018
 */
public class Main {
    public static Map<String, String> teams = new HashMap<>();
    static {
        teams.put("Kansas City", "KAN");
        teams.put("Denver", "DEN");
    }
    public static void main(String[] args) throws Exception {
        FileReader.parse("data/players.csv");
        Map<String, String> passing = DataBaseReader.parse("data/passing.csv");
        Map<String, String> rushing = DataBaseReader.parse("data/rushing.csv");
        Map<String, String> receiving = DataBaseReader.parse("data/receiving.csv");

        System.out.println("PASSING");
        Checker.comparePassing(FileReader.passings, passing);
        System.out.println("RUSHING");
        Checker.compareRushing(FileReader.rushings, rushing);
        System.out.println("RECEIVING");
        Checker.compareReceiving(FileReader.receivings, receiving);
    }
}
