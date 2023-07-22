package kap.newbie.string_generics_collections.lection.test3;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "";

        String s2 = s1 + 12 + 1.2 + args;

        s2 = new StringBuilder(s1) // строка 10 за кадром вероятно будет создана так
                .append(12)
                .append(1.2)
                .toString();

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < 10; ++i){
//            s1 = s1 + "asdf";     {
//            s1 += "asdf";         { медленно (создает объекты на каждой итерации)
//            s1.concat("asdf");    {

            sb.append("asdf");    // быстро
        }
    }
}
