package kap.newbie.basic.quadratic;

import java.util.Scanner;

/**
 * For the given quadratic equation coefficients (ax****2 + bx + c = 0),
 * return one or two roots of the equation if there is any in the set of real numbers.
 *
 * Input value is given via System.in . Output value must be printed to System.out.
 *
 * @author Alexandr Korovkin
 */
public class Quadratic {

    public static final String NO_ROOTS = "No roots";
    public static final int TWO = 2;
    public static final int FOUR = 4;
    public static final String INPUT_MESSAGE = "Input quadratic equation (ax****2 + bx + c = 0) coefficients a,b,c: ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(INPUT_MESSAGE);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double discriminant = Math.pow(b, TWO) - FOUR * a * c;

        if (discriminant == 0) {
            System.out.println(-(double) b / (TWO * (double)a));
        } else if (discriminant > 0) {
            System.out.print(((TWO * c) / (-b + Math.sqrt(discriminant))) + " ");
            System.out.println(((TWO * c) / (-b - Math.sqrt(discriminant))));
        } else {
            System.out.println(NO_ROOTS);
        }
        input.close();
    }
}
