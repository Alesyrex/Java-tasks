package kap.newbie.multithreading.test.task11sendrecievemessage.model;

/**
 * @author Alexandr Korovkin
 */
public class Message {
    private String message;
    private boolean isReceive;

    public Message(){
        message = "";
        isReceive = false;
    }

    public String getMessage() {
        return message;
    }

    public boolean isReceive() {
        return isReceive;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setReceive(boolean receive) {
        isReceive = receive;
    }
}
