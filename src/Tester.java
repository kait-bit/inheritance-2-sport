import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ObjectModel.Football football1 = new ObjectModel.Football("USA", 46);
        ObjectModel.Tennis tennis1 = new ObjectModel.Tennis("England", true, 8);
        ObjectModel.Tennis tennis2 = new ObjectModel.Tennis("China", false, 4);

        ArrayList<ObjectModel.SportsTeam> teams = new ArrayList<>();
        teams.add(football1);
        teams.add(tennis1);
        teams.add(tennis2);

        ObjectModel.Competition competition = new ObjectModel.Competition(teams);

        System.out.println(football1.toString());
        System.out.println(tennis1.toString());
        System.out.println(tennis2.toString());
        competition.startCompetition();
    }
}
