package kap.newbie.iostreams.test.task5in.model;

/**
 * @author Alexandr Korovkin
 */
public enum Color {
    BLUE("blue"),
    WHITE("white"),
    BLACK("black"),
    YELLOW("yellow"),
    SILVER("silver"),
    RED("red"),
    GREEN("green"),
    PINK("pink");

    private final String colour;

    Color(String colour){
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static Color getColor(String color) {
        for (Color c : Color.values()){
            if (c.getColour().equals(color)){
                return c;
            }
        }
        return null;
    }
}
