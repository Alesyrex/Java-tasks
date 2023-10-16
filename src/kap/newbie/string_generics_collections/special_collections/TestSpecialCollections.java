package kap.newbie.string_generics_collections.special_collections;

import kap.newbie.string_generics_collections.special_collections.pair.PairString;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class TestSpecialCollections {
    public static void main(String[] args) {
        PairString pairString = new PairString();

        pairString.add("One");
        pairString.add("Three");
        pairString.add("Five");
        pairString.add("Seven");
        pairString.add("Nine");

        pairString.add("Two",1);

        System.out.println(pairString);

        List<String> list = List.of("Four-1", "Four-2", "Four-3");

        pairString.addAll(3, list);

        printList(pairString);

        pairString.remove(4);
        pairString.remove("Nine");

        System.out.println(pairString);

    }

    public static void printList(PairString pairString) {
        for(String pair : pairString){
            System.out.println(pair);
        }
    }
}
