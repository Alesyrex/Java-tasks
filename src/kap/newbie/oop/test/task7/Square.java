package kap.newbie.oop.test.task7;

/**
 * @author Alexandr Korovkin
 */
public class Square extends CorrectFigure {
    public static final String WIDTH = "---";
    public static final String HEIGHT = "|";
    public static final String CORNER = " ";
    public static final String INNER_SPACE_SQUARE = "   ";

    private final int edge;

    public Square(){
        this(3);
    }

    public Square(int edge){
        this.edge = edge;
    }

    @Override
    public void printFigure() {
        for (int i = 0;i < edge;++i) {
            for (int j = 0; j < edge; ++j) {
                if (isaBoolean(edge, i)) {
                    if (isaBoolean(edge, j)) {
                        System.out.print(CORNER);
                    } else {
                        System.out.print(WIDTH);
                    }
                } else if (isaBoolean(edge, j)) {
                    System.out.print(HEIGHT);
                } else {
                    System.out.print(INNER_SPACE_SQUARE);
                }
            }
            System.out.println();
        }
    }

    private boolean isaBoolean(int edge, int iterator) {
        return iterator == 0 || iterator == edge - 1; // проверяет ребра ли прямоугольника это
    }
}
