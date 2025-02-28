import java.util.ArrayList;

public record Tennis(ArrayList<String> players) implements Sport {
    @Override public String toString() {
        return "Tennis players: " + players;
    }
}
