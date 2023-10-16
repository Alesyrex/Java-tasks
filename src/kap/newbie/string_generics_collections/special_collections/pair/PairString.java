package kap.newbie.string_generics_collections.special_collections.pair;

import java.util.*;

/**
 * Implement a list of Strings that adding/removing elements by pairs.
 *
 * Each time you add a string to the list, you should add it twice,
 * so the list would contain a pair of entries of that string.
 * Each time you remove a string, you should remove a pair of it.
 * List should keep pairs together: if you add a string by index ensure it will not break a pair.
 * Put pair of new element after it.
 * What should be covered in your implementation:
 *
 * adding
 * adding by index
 * removing of object
 * removing by index
 * getting by index
 * setting by index
 * adding of a collection
 * adding of a collection by index
 * iterator (removing via iterator is not required)
 *
 * @author Alexandr Korovkin
 */
public class PairString implements Iterable<String>{
    private final List<Pair> pairWords;

    public PairString() {
        this.pairWords = new ArrayList<>();
    }

    public PairString(String word) {
        pairWords = new ArrayList<>();
        pairWords.add(new Pair(word));
    }

    public void add(String word){
        pairWords.add(new Pair(word));
    }

    public void add(String word, int index){
        pairWords.add(index, new Pair(word));
    }

    public void remove(int index){
        pairWords.remove(index);
    }

    public void remove(String word){
        pairWords.remove(new Pair(word));
    }

    public String get(int index){
        return pairWords.get(index).one;
    }

    public void set(int index, String word){
        pairWords.set(index, new Pair(word));
    }

    public void addAll(Collection<? extends String> collection){
        for(String s : collection){
            this.add(s);
        }
    }

    public void addAll(int index, Collection<? extends String> collection){
        int i = 0;
        for(String s : collection){
            this.add(s, index + i);
            ++i;
        }
    }

    public Iterator<String> iterator(){
        return new Itr();
    }

    @Override
    public String toString() {
        return pairWords.toString();
    }

    private static class Pair{
        private final String one;
        private final String two;

        public Pair(String one) {
            this.one = one;
            this.two = one;
        }

        public String getOne() {
            return one;
        }

        public String getTwo() {
            return two;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj){
                return true;
            }

            if(obj == null || !getClass().equals(obj.getClass())){
                return false;
            }

            Pair pair = (Pair) obj;
            return one.equals(pair.getOne()) && two.equals(pair.getTwo());
        }

        @Override
        public int hashCode() {
            return one.hashCode() + two.hashCode();
        }

        @Override
        public String toString() {
            return String.format("%s, %s", one, two);
        }
    }

    private class Itr implements Iterator<String>{
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != pairWords.size();
        }

        @Override
        public String next() {
            int i = cursor;
            if (i >= pairWords.size())
                throw new NoSuchElementException();

            cursor = i + 1;

            return pairWords.get(i).toString();
        }
    }
}
