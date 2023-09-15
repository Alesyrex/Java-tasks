package kap.newbie.multithreading.test.task13controlaccidentroom.service;

import kap.newbie.multithreading.test.task13controlaccidentroom.model.Accident;
import kap.newbie.multithreading.test.task13controlaccidentroom.model.AccidentIdentifier;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexandr Korovkin
 */
public class ControlAccident {
    private final Map<AccidentIdentifier, Accident> regedit;

    public ControlAccident() {
        regedit = new HashMap<>();
    }

    public Map<AccidentIdentifier, Accident> getRegedit() {
        return regedit;
    }

    public void addNewAccident(Accident accident){
        regedit.put(accident.getIdentifier(), accident);
    }

    public Accident getAccident(){
        Accident accident = regedit.values().stream()
                .filter(acc -> !acc.isProcessed())
                .findFirst()
                .orElseThrow();

        accident.processed();

        return accident;
    }
}
