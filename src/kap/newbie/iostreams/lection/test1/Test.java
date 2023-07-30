package kap.newbie.iostreams.lection.test1;

import java.io.File;
import java.io.IOException;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("./resources/iostreams/lections/test1");

        if (file.isDirectory()){
            System.out.println(file.getAbsolutePath());
        }

        File file2 = new File("./resources/iostreams/lections/test1/tst.txt");

        try{
            boolean created = file2.createNewFile();
            if (created){
                System.out.println("New file is created!");
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        if (file2.isFile()){
            System.out.println(file2.getName());
        }

        File mainFile = new File("./resources/iostreams");

        if (mainFile.exists() && mainFile.isDirectory()){
            catalogView(mainFile);
        }

        File file3 = new File("./resources/iostreams/lections/test1/newDir");
        boolean createdDir = file3.mkdir();
        if (createdDir){
            System.out.println("New directory is created!");
        }
    }

    public static void catalogView(File mainFile) {
        for (File f : mainFile.listFiles()){
            if (f.isDirectory()){
                System.out.println(f.getParent() + "\\" + f.getName() + " - directory");
                catalogView(f);
            }
            if (f.isFile()){
                System.out.println(f.getParent() + "\\" + f.getName() + " - file");
            }
        }
    }
}
