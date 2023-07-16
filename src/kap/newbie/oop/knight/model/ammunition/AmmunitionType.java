package kap.newbie.oop.knight.model.ammunition;

/**
 * @author Alexandr Korovkin
 */
public enum AmmunitionType {
    SWORD(1, "Sword", "damage"),
    HELMET(2 , "Helmet", "protection");

    private final int id;
    private final String typeName;

    private final String featureParam;

    AmmunitionType(int id, String typeName, String featureParam){
        this.id = id;
        this.typeName = typeName;
        this.featureParam = featureParam;
    }

    public int getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getFeatureParam() {
        return featureParam;
    }
}
