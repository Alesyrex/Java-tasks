package kap.newbie.basic.test;

/**
 * Написать программу, которая объединяет любое количество строк,
 * объединяя их через пробел. Реализацию конкатенации строк вынести в отдельный метод.
 *
 * @author Alexandr Korovkin
 */
public class Test34 {
    public static void main(String[] args) {
        String result = concat("Machine", "Box", "Email", "Some word");
        System.out.println(result);
    }

    public static String concat(String ...line) {
        if (line.length == 0) {
            return "";
        }

        String result = "";
        for (String s : line) {
            result += s + " ";
        }
        return result;
    }
}
