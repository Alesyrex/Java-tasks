package kap.newbie.string_generics_collections.test.task18tasksconveer.model;

/**
 * @author Alexandr Korovkin
 */
public class Task implements Comparable<Task>{
    public static final String DOING_SOME_ACTION = "Doing some action";
    private final String title;
    private final String description;

    public Task(String title){
        this(title, DOING_SOME_ACTION);

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

    @Override
    public int compareTo(Task o) {
        return title.compareTo(o.getTitle());
    }
}
