package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public class Helmet extends ProtectionAmmunition{

    public static final String HELMET_STRING_FORMAT = "%s { %s = %d; weight = %d; cost = %d }";

    public Helmet () {
        super();
    }

    public Helmet(int protection, int weight, int cost) {
        super(protection, weight, cost);
    }

    @Override
    public String toString() {
        return String.format(HELMET_STRING_FORMAT,
                            AmmunitionType.HELMET.getTypeName(), AmmunitionType.HELMET.getFeatureParam(),
                            getProtection(), getWeight(), getCost());
    }
}
