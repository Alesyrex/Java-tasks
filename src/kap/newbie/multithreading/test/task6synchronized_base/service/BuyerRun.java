package kap.newbie.multithreading.test.task6synchronized_base.service;

import kap.newbie.multithreading.test.task6synchronized_base.model.Buyer;

/**
 * @author Alexandr Korovkin
 */
public class BuyerRun implements Runnable{
    private final Buyer buyer;
    private final BuyerService buyerService;

    public BuyerRun(Buyer buyer, BuyerService buyerService){
        this.buyer = buyer;
        this.buyerService = buyerService;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try {
                buyerService.buy(buyer);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
