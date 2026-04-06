package effective.Item1.exercise3;

public class Color {
    private final String name;
    private Color(String name) { this.name = name; }

    private static final Color RED = new Color("red");
    private static final Color GREEN = new Color("green");
    private static final Color BLUE = new Color("blue");

    public static Color getInstance(String name) {
        // name.toLowerCase() 是 Java 中 String 类的一个方法，作用是将字符串中的所有英文字母转换为小写形式，并返回一个新的字符串（原字符串不变，因为字符串是不可变的）。
        switch (name.toLowerCase()) {
            case "red": return RED;
            case "green": return GREEN;
            case "blue": return BLUE;
            default: throw new IllegalArgumentException("Unknown color");
        }
    }
}