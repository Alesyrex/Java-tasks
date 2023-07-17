package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public abstract class AttackAmmunition implements Ammunition {
    private final int damage;
    private final int weight;
    private final int cost;

    public AttackAmmunition(){
        this(0,0,0);
    }

    public AttackAmmunition(int weight, int cost, int damage){
        this.damage = damage;
        this.weight = weight;
        this.cost = cost;
    }

    public int getDamage(){
        return damage;
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
