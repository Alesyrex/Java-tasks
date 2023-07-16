package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public class Sword extends AttackAmmunition{
    public static final String HELMET_STRING_FORMAT = "Sword { damage = %d; weight = %d; cost = %d }";

    public Sword () {
        super();
    }

    public Sword(int damage, int weight, int cost) {
        super(damage, weight, cost);
    }

    @Override
    public String toString() {
        return String.format(HELMET_STRING_FORMAT, getDamage(), getWeight(), getCost());
    }
}
