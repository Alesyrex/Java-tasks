package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public abstract class ProtectionAmmunition implements Ammunition {
    private final int protection;
    private final int weight;
    private final int cost;

    public ProtectionAmmunition (){
        this(0,0,0);
    }

    public ProtectionAmmunition(int weight, int cost, int protection) {
        this.protection = protection;
        this.weight = weight;
        this.cost = cost;
    }

    public int getProtection(){
        return protection;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
