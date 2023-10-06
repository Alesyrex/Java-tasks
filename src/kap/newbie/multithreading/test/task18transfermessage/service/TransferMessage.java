package kap.newbie.multithreading.test.task18transfermessage.service;

import kap.newbie.multithreading.test.task18transfermessage.model.Message;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

/**
 * @author Alexandr Korovkin
 */
public class TransferMessage {
    public static final String SEND_MESSAGE = "Send message: ";
    public static final String RECEIVE_MESSAGE = "Receive message";

    private final LinkedTransferQueue<Message> transfer;

    private final Scanner scanner = new Scanner(System.in);


    public TransferMessage(){
        this.transfer = new LinkedTransferQueue<>();
    }

    public void sendMessage(Message message){
        try {
            System.out.print(SEND_MESSAGE);
            message.setText(scanner.nextLine());
            transfer.transfer(message);
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String receiveMessage(){
        try {
            return String.format("%s: %s", RECEIVE_MESSAGE, transfer.take().getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
