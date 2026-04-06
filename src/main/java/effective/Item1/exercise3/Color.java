package effective.Item1.exercise3;

public class Color {
    private final String name;
    private Color(String name) { this.name = name; }

    private static final Color RED = new Color("red");
    private static final Color GREEN = new Color("green");
    private static final Color BLUE = new Color("blue");

    public static Color getInstance(String name) {
        switch (name.toLowerCase()) {
            case "red": return RED;
            case "green": return GREEN;
            case "blue": return BLUE;
            default: throw new IllegalArgumentException("Unknown color");
        }
    }
}