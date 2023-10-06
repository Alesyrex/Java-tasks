package kap.newbie.multithreading.test.task18transfermessage.model;

/**
 * @author Alexandr Korovkin
 */
public class Message {
    private String text;

    public Message(){
        text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
