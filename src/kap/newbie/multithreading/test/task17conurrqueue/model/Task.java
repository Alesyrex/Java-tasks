package kap.newbie.multithreading.test.task17conurrqueue.model;

/**
 * @author Alexandr Korovkin
 */
public class Task {
    public static final String TEMP_DESCRIPTION = "Doing some process";
    private final String title;
    private final String description;

    public Task(String title){
        this(title, TEMP_DESCRIPTION);
    }

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
