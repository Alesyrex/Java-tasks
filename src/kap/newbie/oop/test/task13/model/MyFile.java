package kap.newbie.oop.test.task13.model;

/**
 * @author Alexandr Korovkin
 */

public class MyFile {
    public static final String K_BYTE = " kb";
    public static final String SPACE = " ";
    private final String nameFile;
    private final int fileSize;
    private final FileType fileType;

    public MyFile(String nameFile, int fileSize, FileType fileType){
        this.nameFile = nameFile;
        this.fileSize = fileSize;
        this.fileType = fileType;
    }

    @Override
    public int hashCode() {
        int result = nameFile != null ? nameFile.hashCode() : 0;
        result = 31 * result + fileSize;
        return  31 * result + (fileType != null ? fileType.hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals((obj.getClass()))) {
            return false;
        }
        MyFile file = (MyFile)obj;

        return this.nameFile.equals(file.nameFile) && this.fileSize == file.fileSize
                && this.fileType.equals(file.fileType);
    }

    @Override
    public String toString() {
        return nameFile + fileType.getType() + SPACE + fileSize + K_BYTE;
    }

    public String getNameFile() {
        return nameFile;
    }
}
