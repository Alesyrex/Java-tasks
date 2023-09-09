package kap.newbie.multithreading.test.task6synchronized_base.service;

import kap.newbie.multithreading.test.task6synchronized_base.model.Supplier;

/**
 * @author Alexandr Korovkin
 */
public class SupplierRun implements Runnable{
    private final Supplier supplier;
    private final SupplierService supplierService;

    public SupplierRun(Supplier supplier, SupplierService supplierService) {
        this.supplier = supplier;
        this.supplierService = supplierService;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try {
                supplierService.supply(supplier);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
