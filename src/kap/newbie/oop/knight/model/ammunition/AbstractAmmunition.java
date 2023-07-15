package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public class AbstractAmmunition implements Ammunition{
    private int weight;
    private int cost;

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
