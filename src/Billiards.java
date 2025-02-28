import java.util.ArrayList;

public record Billiards(ArrayList<String> players, String variation) implements Sport {
    public String getNumBalls() {
        if (variation.equals("8-Ball")) {
            return variation + " requires 15 numbered balls plus 1 cue ball.";
        } else if (variation.equals("9-Ball")) {
            return variation + " requires 9 numbered balls plus 1 cue ball.";
        } else {
            return "Unrecognized variation: " + variation;
        }
    }

    @Override public String toString() {
        return "Variation: " + "[" + variation + "] , Billiards players: " + players;
    }
}
