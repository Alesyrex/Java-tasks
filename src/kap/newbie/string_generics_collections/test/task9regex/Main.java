package kap.newbie.string_generics_collections.test.task9regex;

/**
 * Реализуйте boolean-метод, валидирующий входящую строку.
 * Метод должен возвращать true, если строка соответствует номеру мобильного телефона
 * (в качестве примера привожу номер для РФ, вы можете выбрать любой другой, но со схожей маской).
 *
 * Маска корректного номера: +7 (XXX) XXX-XX-XX, где "X" – цифра от 0 до 9.
 * Обратите внимание на наличие скобок и пробелов.
 *
 * Вариант с усложнением (*): решите ту же задачу, но символы скобок, дефиса и пробелов – опциональны
 * (каждый из них может или присутствовать, как на оригинальной маске, так и отсутствовать вовсе,
 * возможность частичного использования или использования символов-разделителей в другом порядке считаем невалидным).
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) {
        String[] phoneNumbers = new String[]{"+79209610182",  //true
                                            "+7 920 961-01-82",  //true
                                            "89209610182",  //true
                                            "8 920 961-01-82",  //true
                                            "8 920 961 01 82",  //true
                                            "8 (920) 961-01-82",  //true
                                            "+7 (920) 961-01-82",  //true
                                            "8 (920) 961 01 82",  //true
                                            "8 (450) 962-01 82",  //false
                                            "8 950 962 01-82",   //true
                                            "9 920 961-01-82",   //false
                                            "+7 (920 961 01 82"};  //false

        for (String number : phoneNumbers) {
            System.out.println(NumberPhoneValidator.isValid(number));
        }
    }
}
