package sport.parser;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 03.10.2018
 */
public class Checker {
    public static void comparePassing(List<Passing> fromWebSite, Map<String, String> fromDataBase) {
        fromWebSite.forEach(passing -> {
            if (fromDataBase.get(passing.playerName) != null) {
                if (!fromDataBase.get(passing.playerName).equals(passing.getInFormat())) {
                    System.out.println("DataBase: " + passing.getInFormat() + "\n"
                            + "WebSite: " + fromDataBase.get(passing.playerName));
                }
            } else {
                System.out.println("No player with name: " + passing.playerName);
            }
        });
    }

    public static void compareRushing(List<Rushing> fromWebSite, Map<String, String> fromDataBase) {
        fromWebSite.forEach(rushing -> {
            if (fromDataBase.get(rushing.playerName) != null) {
                if (!fromDataBase.get(rushing.playerName).equals(rushing.getInFormat())) {

                    String fromDataBaseWithoutLong = fromDataBase.get(rushing.playerName)
                            .substring(0, fromDataBase.get(rushing.playerName).lastIndexOf(","));
                    String fromWebSiteWithoutLong = rushing.getInFormat()
                            .substring(0, rushing.getInFormat().lastIndexOf(","));

                    if (fromDataBaseWithoutLong.equals(fromWebSiteWithoutLong)) {
                        System.out.println("LONG \n" + "DataBase: " + rushing.getInFormat() + "\n"
                                + "WebSite: " + fromDataBase.get(rushing.playerName));
                    } else {
                        System.out.println("DataBase: " + rushing.getInFormat() + "\n"
                                + "WebSite: " + fromDataBase.get(rushing.playerName));
                    }
                }
            } else {
                System.out.println("No player with name: " + rushing.playerName);
            }
        });
    }

    public static void compareReceiving(List<Receiving> fromWebSite, Map<String, String> fromDataBase) {
        fromWebSite.forEach(receiving -> {
            if (fromDataBase.get(receiving.playerName) != null) {
                if (!fromDataBase.get(receiving.playerName).equals(receiving.getInFormat())) {
//                    System.out.println("DataBase: " + receiving.getInFormat() + "\n"
//                            + "WebSite: " + fromDataBase.get(receiving.playerName));

                    String lastItem = fromDataBase.get(receiving.playerName)
                            .substring(fromDataBase.get(receiving.playerName).lastIndexOf(","));
                    String fromDataBaseWithoutLong = fromDataBase.get(receiving.playerName)
                            .substring(0, fromDataBase.get(receiving.playerName).lastIndexOf(","));
                    fromDataBaseWithoutLong = fromDataBaseWithoutLong
                            .substring(0, fromDataBaseWithoutLong.lastIndexOf(",")) + lastItem;

                    lastItem = receiving.getInFormat()
                            .substring(receiving.getInFormat().lastIndexOf(","));
                    String fromWebSiteWithoutLong = receiving.getInFormat()
                            .substring(0, receiving.getInFormat().lastIndexOf(","));
                    fromWebSiteWithoutLong = fromWebSiteWithoutLong
                            .substring(0, fromWebSiteWithoutLong.lastIndexOf(",")) + lastItem;

                    if (fromDataBaseWithoutLong.equals(fromWebSiteWithoutLong)) {
                        System.out.println("LONG \n" + "DataBase: " + receiving.getInFormat() + "\n"
                                + "WebSite: " + fromDataBase.get(receiving.playerName));
                    } else {
                        System.out.println("DataBase: " + receiving.getInFormat() + "\n"
                                + "WebSite: " + fromDataBase.get(receiving.playerName));
                    }
                }
            } else {
                System.out.println("No player with name: " + receiving.playerName);
            }
        });
    }
}
