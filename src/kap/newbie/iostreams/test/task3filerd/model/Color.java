package kap.newbie.iostreams.test.task3filerd.model;

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
}
