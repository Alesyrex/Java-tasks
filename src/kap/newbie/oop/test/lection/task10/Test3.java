package kap.newbie.oop.test.lection.task10;

import java.sql.SQLException;
import java.util.*;

/**
 * @author Alexandr Korovkin
 */
public class Test3 {
    static void print(Iterable list){
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Collection cont;

        cont = new ArrayList();
        cont.add(1);
        cont.add(2);

        print(cont);
        print(new SQLException());
        print(new Z());
    }
}

class Z implements Iterable{
    public Iterator iterator(){
        return null;
    }
}
