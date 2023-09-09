package kap.newbie.multithreading.test.task6synchronized_base.service;

import kap.newbie.multithreading.test.task6synchronized_base.model.SaleBase;

/**
 * @author Alexandr Korovkin
 */
public class SaleBaseHolder {
    private final SaleBase saleBase;

    public SaleBaseHolder(SaleBase saleBase){
        this.saleBase = saleBase;
    }

    public boolean isBuyingAvailable(){
        return saleBase.getProductsAmount() > 0;
    }

    public boolean isSupplyingAvailable(){
        double fillPercent = (double) saleBase.getProductsAmount() / (double) saleBase.getMaxProducts();
        return fillPercent <= saleBase.getFullnessPercent();
    }

    public boolean isBuying(int count){
        if(saleBase.getProductsAmount() < count){
            return false;
        }

        saleBase.setProductsAmount(saleBase.getProductsAmount() - count);
        return true;
    }

    public void supply(int count){
        saleBase.setProductsAmount(saleBase.getProductsAmount() + count);
    }

    public SaleBase getSaleBase() {
        return saleBase;
    }
}
