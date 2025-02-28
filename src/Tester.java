import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Dan");
        players.add("Dylan");
        players.add("Jason");
        players.add("Kaitlin");
        Billiards b = new Billiards(players, "8-Ball");

        ArrayList<String> players2 = new ArrayList<>();
        players2.add("Venus");
        players2.add("Serena");
        Tennis t = new Tennis(players2);

        System.out.println(b.getNumBalls());
        System.out.println(b.toString());
        System.out.println();
        System.out.println(t.toString());

        ArrayList<Sport> sports = new ArrayList<>();
        sports.add(b);
        sports.add(t);

        System.out.println("Total players: " + countTotalPlayers(sports));
    }

    public static int countTotalPlayers(ArrayList<Sport> sports) {
        int total = 0;

        for (Sport s : sports) {
            total += s.players().size();
        }

        return total;
    }
}
