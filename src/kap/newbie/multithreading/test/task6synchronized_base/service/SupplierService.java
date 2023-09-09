package kap.newbie.multithreading.test.task6synchronized_base.service;

import kap.newbie.multithreading.test.task6synchronized_base.model.SaleBase;
import kap.newbie.multithreading.test.task6synchronized_base.model.Supplier;

import java.util.Random;

/**
 * @author Alexandr Korovkin
 */
public class SupplierService{
    public static final int MAX_SUPPLYING_PRODUCTS = 26;

    private final SaleBaseHolder saleBaseHolder;

    private final Random random;

    public SupplierService(SaleBaseHolder saleBaseHolder){
        this.saleBaseHolder = saleBaseHolder;

        this.random = new Random();
    }

    public void supply(Supplier supplier) throws InterruptedException {
        synchronized (saleBaseHolder){
            while (!saleBaseHolder.isSupplyingAvailable()){
                saleBaseHolder.wait();
            }

            tryToSupply(supplier);

            if(saleBaseHolder.isBuyingAvailable()){
                saleBaseHolder.notifyAll();
            }
        }
    }

    private void tryToSupply(Supplier supplier){
        int supplyingAvailableAmount =
                Math.min(supplier.getProductAmount(), saleBaseHolder.getSaleBase().getFreeSpace());
        saleBaseHolder.supply(supplyingAvailableAmount);

        System.out.printf("Supplier %s tried to supply %d products. Successfully supply: %d\n",
                supplier.getName(), supplier.getProductAmount(), supplyingAvailableAmount);

        int newSupplierProductAmount = supplier.getProductAmount() == supplyingAvailableAmount ?
                random.nextInt(MAX_SUPPLYING_PRODUCTS) : supplier.getProductAmount() - supplyingAvailableAmount;

        supplier.setProductAmount(newSupplierProductAmount);
    }
}
