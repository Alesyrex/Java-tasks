package kap.newbie.functional_programming.lection.test6;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * @author Alexandr Korovkin
 */
public class TestSupplier {
    public static void main(String[] args) {
        Supplier<User> authorization = () -> {
            String login;
            String pass;
            try (Scanner input = new Scanner(System.in)){
                System.out.print("login: ");
                login = input.next();
                System.out.print("password: ");
                pass = input.next();
            }
            return new User(login, pass);
        };

        System.out.println(authorization.get());
    }
}
