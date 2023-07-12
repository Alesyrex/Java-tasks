package kap.newbie.oop.test.task13.controller;

import kap.newbie.oop.test.task13.model.MyFile;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * @author Alexandr Korovkin
 */
public class FileManager {
    private MyFile[] files;

    public FileManager(){
        files = new MyFile[0];
    }

    public FileManager(MyFile ...files){
        this.files = files;
    }

    public boolean addFile(MyFile file){
        if (file == null) {
            return false;
        }
        MyFile[] newFiles = Arrays.copyOf(files,files.length + 1);
        newFiles[files.length] = file;
        files = newFiles;
        return true;
    }

    public void findFileByName(String searchingNameFile)throws FileNotFoundException{
        for (MyFile file : files){
            if (file.getNameFile().equals(searchingNameFile)) {
                System.out.println(file.toString());
            }
        }
        throw new FileNotFoundException("Searching file by name not found!");
    }

    public MyFile findFile(MyFile searchingFile) throws FileNotFoundException{
        for (MyFile file : files) {
            if (file.hashCode() == searchingFile.hashCode() && file.equals(searchingFile)) {
                return file;
            }
        }
        throw new FileNotFoundException("Searching file not found!");
    }
}
