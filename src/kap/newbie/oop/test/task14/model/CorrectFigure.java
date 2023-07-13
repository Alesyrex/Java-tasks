package kap.newbie.oop.test.task14.model;

/**
 * @author Alexandr Korovkin
 */
public class CorrectFigure implements FigurePrintable {
    public static final String UNKNOWN_FIGURE = "Unknown figure";

    @Override
    public void printFigure() {
        System.out.println(UNKNOWN_FIGURE);
    }
}
