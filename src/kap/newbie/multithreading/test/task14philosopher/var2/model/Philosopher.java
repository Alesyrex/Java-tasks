package kap.newbie.multithreading.test.task14philosopher.var2.model;

/**
 * @author Alexandr Korovkin
 */
public class Philosopher {
    private final int philosopherId;
    private int eatingNum;
    private boolean eating;


    public Philosopher(int philosopherId){
        this.philosopherId = philosopherId;
        this.eatingNum = 0;
        this.eating = false;
    }

    public int getPhilosopherId() {
        return philosopherId;
    }

    public int getEatingNum() {
        return eatingNum;
    }

    public boolean isEating() {
        return eating;
    }

    public int incrementEatingNum() {
        return ++this.eatingNum;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }
}
