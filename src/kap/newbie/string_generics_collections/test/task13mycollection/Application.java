package kap.newbie.string_generics_collections.test.task13mycollection;

import kap.newbie.string_generics_collections.test.task13mycollection.exception.InvalidElementException;
import kap.newbie.string_generics_collections.test.task13mycollection.exception.InvalidRemoveException;

/**
 * @author Alexandr Korovkin
 */
public class Application {
    public static void main(String[] args) throws InvalidRemoveException, InvalidElementException {
        MyStackCollection<Integer> stack = new MyStackCollection<>(99);

        stack.add(88);
        stack.add(77);
        stack.add(66);
        stack.add(55);
        System.out.println(stack + " " + stack.size());
        stack.remove(77);
        System.out.println(stack + " " + stack.size());
        stack.add(44);
        stack.add(33);
        stack.removeElement();

        System.out.println(stack.size());
        System.out.println(stack.contains(88));
        System.out.println(stack.contains(11));

        for (Integer i : stack){
            System.out.println(i);
        }

        System.out.println(stack);

        MyStackCollection<String> stackString = new MyStackCollection<>();

        stackString.add("welcome");
        stackString.add("and");
        stackString.add("friend");
        stackString.add("new");
        stackString.add("my");
        stackString.add("Hello");

        System.out.println(stackString);

        for (String s : stackString){
            System.out.print(s + " ");
        }

    }
}
