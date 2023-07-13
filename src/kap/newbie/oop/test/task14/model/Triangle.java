package kap.newbie.oop.test.task14.model;

/**
 * @author Alexandr Korovkin
 */
public class Triangle extends CorrectFigure {
    public static final String WIDTH_LINE = "_";
    public static final String HEIGHT_RIGHT = "/";
    public static final String HEIGHT_LEFT = "\\";
    public static final String INNER_SPACE_TRIANGLE = " ";
    public static final String LINE_SEPARATOR = "\n";

    private final int edge;

    public Triangle(){
        this(3);
    }

    public Triangle(int edge){
        this.edge = edge;
    }

    @Override
    public void printFigure() {
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
        return line += LINE_SEPARATOR;
    }
}
