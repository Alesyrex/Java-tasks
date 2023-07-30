package kap.newbie.iostreams.lection.test3;

import java.io.*;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static final String RESOURCES_LECTIONS = "./resources/iostreams/lections/";

    public static void main(String[] args) {
        File dir = new File(RESOURCES_LECTIONS + "test3");
        if (dir.mkdir()) {
            System.out.println("New directory '" + dir.getName() + "' created");
        }
        File file = new File(RESOURCES_LECTIONS + "/test3/test.txt");

        long after = System.currentTimeMillis();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            String text = "Hello World!\nHey! Teachers! Leave the kids alone.";
            bw.write(text);
        } catch (IOException exception) {
            System.out.println(exception.getMessage() + "exception");
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
//            int c;
//            while ((c = br.read()) != -1) {
//                System.out.print((char)c);
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
        }

        long before = System.currentTimeMillis();
        System.out.println(before - after);
    }
}
