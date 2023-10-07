package kap.newbie.multithreading.test.task18transfermessage;

import kap.newbie.multithreading.test.task18transfermessage.model.Message;
import kap.newbie.multithreading.test.task18transfermessage.service.TransferMessage;

/**
 * Реализуйте имитацию отправки и получения сообщений.
 * Один поток должен принимать сообщение, введенное с клавиатуры,
 * другой поток должен выводить это сообщение в консоль.
 * Выполнение программы должно завершиться при вводе пользователем «Finish».
 *
 * Реализовать с помощью очередей
 *
 * @author Alexandr Korovkin
 */
public class SendReceiveWithQueue {
    public static final String FINISH = "Finish";


    public static void main(String[] args) {
        TransferMessage transferMessage = new TransferMessage();
        Message message = new Message();

        Thread sender = new Thread(() -> {
            while (!message.getText().equals(FINISH)){
                transferMessage.sendMessage(message);
            }
        });

        Thread receiver = new Thread(() -> {
            while (!message.getText().equals(FINISH)) {
                transferMessage.receiveMessage();
            }
        });

        sender.start();
        receiver.start();

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
