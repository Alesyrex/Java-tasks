package kap.newbie.multithreading.test.task19taskpool.model;

import java.util.Random;

/**
 * @author Alexandr Korovkin
 */
public class Task {
    public static final int BOUND_FOR_RANDOM = 100;
    private final int number;
    private final String description;

    public Task(String description) {
        Random random = new Random();
        this.number = random.nextInt(BOUND_FOR_RANDOM);
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%s : random number - %d", description, number);
    }
}
