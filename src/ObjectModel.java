import java.util.ArrayList;

public class ObjectModel {

    public interface SportsTeam {
        int players();
    }

    public record Football(String country, int players) implements SportsTeam {
        @Override public String toString() {
            return "Country: " + country + " w/ " + players + " players";
        }
    }

    public record Tennis(String country, boolean doubles, int players) implements SportsTeam {
        @Override public String toString() {
            return "Country: " + country + ", playing doubles? " + doubles + " w/ " + + players + " players";
        }
    }

    public record Competition(ArrayList<SportsTeam> teams) {
        public void startCompetition() {
            // ALT SOL: int numTeams = 0;
            int totalPlayers = 0;

            for (SportsTeam team : teams) {
                // ALT SOL: numTeams++;
                totalPlayers += team.players();
            }

            System.out.println(totalPlayers + " players from " + teams.size() + " teams are competing in today's competition.");
        }
    }
}
