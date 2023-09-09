package kap.newbie.multithreading.test.task6synchronized_base.model;

/**
 * @author Alexandr Korovkin
 */
public class Buyer {
    private final String name;
    private int productAmount;

    public Buyer(String name){
        this.name = name;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getName() {
        return name;
    }
}
