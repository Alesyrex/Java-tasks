package kap.newbie.multithreading.test.task6synchronized_base.model;

/**
 * @author Alexandr Korovkin
 */
public class Supplier {
    private final String name;
    private int productAmount;

    public Supplier(String name){
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
