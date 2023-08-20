package kap.newbie.functional_programming.test.task4foreach;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        list.forEach(System.out::print);

        System.out.println();

        list.forEach(Application::print);
    }

    private static void print(Integer numb){
        System.out.print(numb);
    }
}
