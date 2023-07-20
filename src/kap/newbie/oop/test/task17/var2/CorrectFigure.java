package kap.newbie.oop.test.task17.var2;

/**
 * @author Alexandr Korovkin
 */
public class CorrectFigure {
    public static final String UNKNOWN_FIGURE = "Unknown figure";

    private int edge;

    protected void printFigure(){
        System.out.println(UNKNOWN_FIGURE);
    }

    class Square {
        public static final String WIDTH = "---";
        public static final String HEIGHT = "|";
        public static final String CORNER = " ";
        public static final String INNER_SPACE_SQUARE = "   ";

        public Square(int edge){
            CorrectFigure.this.edge = edge;
        }

        protected void printFigure() {
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

    class Triangle {
        public static final String WIDTH_LINE = "_";
        public static final String HEIGHT_RIGHT = "/";
        public static final String HEIGHT_LEFT = "\\";
        public static final String INNER_SPACE_TRIANGLE = " ";
        public static final String LINE_SEPARATOR = "\n";

        public Triangle(int edge){
            CorrectFigure.this.edge = edge;
        }

        protected void printFigure() {
            String figure = "";

            for (int i = 0; i < edge; ++i) {
                if (i != edge - 1) {
                    figure += doLine(edge - i, (edge + 1) + i, INNER_SPACE_TRIANGLE);
                } else {
                    figure += doLine(edge - i, (edge + 1) + i, WIDTH_LINE);
                }
            }
            System.out.println(figure);
        }

        private String doLine(int right, int left, String space){
            String line = "";
            for(int i = 1;i <= edge * 2;++i){
                if(i == right){
                    line += HEIGHT_RIGHT;
                } else if (i == left){
                    line += HEIGHT_LEFT;
                } else {
                    line += space;
                }
            }
            return line + LINE_SEPARATOR;
        }
    }
}
