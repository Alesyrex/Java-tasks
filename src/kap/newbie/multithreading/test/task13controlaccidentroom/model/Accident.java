package kap.newbie.multithreading.test.task13controlaccidentroom.model;

/**
 * @author Alexandr Korovkin
 */
public class Accident {
    private final AccidentIdentifier identifier;
    private final String description;
    private boolean processed;

    public Accident(AccidentIdentifier identifier, String description) {
        this.identifier = identifier;
        this.description = description;
        processed = false;
    }

    public AccidentIdentifier getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void processed() {
        processed = true;
    }
}

