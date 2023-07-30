package kap.newbie.iostreams.lection.test2;

import java.io.*;
import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File ("./resources/iostreams/lections/test2");
        boolean createdDir = dir.mkdir();
        if (createdDir) {
            System.out.println("New directory is created! Path:\n" + dir.getAbsolutePath());
        }
        File file = new File("./resources/iostreams/lections/test2/test.txt");
        try{
            boolean createdFile = file.createNewFile();
            if(createdFile){
                System.out.println("File test.txt is created!");
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        try(FileWriter writer = new FileWriter(file,true);
            FileReader reader = new FileReader(file)) {
            String message = "Hello my new friends!\n";
            writer.append(message);
            writer.append("Hayshki!\n");

            StringBuilder readMessage = new StringBuilder();
            char[] buf = new char[256];
            int c;

            while ((c = reader.read(buf)) > 0){
                if (c < 256){
                    buf = Arrays.copyOf(buf ,c);
                }
                readMessage.append(buf);
            }

            System.out.println(readMessage.toString());
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
