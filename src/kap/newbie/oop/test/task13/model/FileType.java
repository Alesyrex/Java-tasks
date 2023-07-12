package kap.newbie.oop.test.task13.model;

/**
 * @author Alexandr Korovkin
 */
public enum FileType {
    TEXT(".txt"),
    IMAGE(".jpg"),
    VIDEO(".avi"),
    AUDIO(".mp3"),
    SYSTEM(".sys");

    private final String type;

    FileType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
