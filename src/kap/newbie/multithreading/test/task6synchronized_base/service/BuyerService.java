package kap.newbie.multithreading.test.task6synchronized_base.service;

import kap.newbie.multithreading.test.task6synchronized_base.model.Buyer;

import java.util.Random;

/**
 * @author Alexandr Korovkin
 */
public class BuyerService{
    public static final int MAX_BUYER_AMOUNT = 18;

    private final SaleBaseHolder saleBaseHolder;

    private final Random random;

    public BuyerService(SaleBaseHolder saleBaseHolder){
        this.saleBaseHolder = saleBaseHolder;
        random = new Random();
    }

    public void buy(Buyer buyer) throws InterruptedException {
        synchronized (saleBaseHolder){
            while (!saleBaseHolder.isBuyingAvailable()){
                saleBaseHolder.wait();
            }

            tryToBuy(buyer);

            if(saleBaseHolder.isSupplyingAvailable()){
                saleBaseHolder.notifyAll();
            }
        }
    }

    private void tryToBuy(Buyer buyer){
        boolean success = saleBaseHolder.isBuying(buyer.getProductAmount());

        System.out.printf("Buyer %s tried to buy %d products. Result: %s\n", buyer.getName(),
                buyer.getProductAmount(), success);

        int newBuyerAmount = success ? random.nextInt(MAX_BUYER_AMOUNT) + 1 : buyer.getProductAmount() - 1;
        buyer.setProductAmount(newBuyerAmount);
    }
}
