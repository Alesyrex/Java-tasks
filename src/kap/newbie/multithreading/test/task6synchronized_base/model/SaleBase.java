package kap.newbie.multithreading.test.task6synchronized_base.model;

/**
 * @author Alexandr Korovkin
 */
public class SaleBase {
    private final int maxProducts;
    private int productsAmount;
    private final double fullnessPercent;

    public SaleBase(int maxProducts, double fullnessPercent){
        this.maxProducts = maxProducts;
        this.fullnessPercent = fullnessPercent;
    }

    public int getProductsAmount() {
        return productsAmount;
    }

    public int getFreeSpace(){
        return maxProducts - productsAmount;
    }

    public double getFullnessPercent() {
        return fullnessPercent;
    }

    public void setProductsAmount(int productsAmount) {
        this.productsAmount = productsAmount;
    }

    public int getMaxProducts() {
        return maxProducts;
    }
}
