package kap.newbie.multithreading.test.task13controlaccidentroom.model;


import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Alexandr Korovkin
 */
public class AccidentIdentifier {
    private final LocalDateTime time;
    private final int id;

    public AccidentIdentifier(LocalDateTime time, int id) {
        this.time = time;
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hashcode = id << 31;
        hashcode += 31 * time.hashCode();
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj == null || !getClass().equals(obj.getClass())){
            return false;
        }

        AccidentIdentifier accident = (AccidentIdentifier) obj;

        return accident.id == this.id && Objects.equals(accident.time, this.time);
    }
}
