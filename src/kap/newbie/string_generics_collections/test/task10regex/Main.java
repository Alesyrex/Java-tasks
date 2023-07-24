package kap.newbie.string_generics_collections.test.task10regex;

import kap.newbie.string_generics_collections.test.task10regex.exception.ValidateException;
import kap.newbie.string_generics_collections.test.task10regex.model.FullName;
import kap.newbie.string_generics_collections.test.task10regex.service.FullNameValidator;

/**
 *
 * Реализуйте метод для работы с ФИО. Входным параметром должна являться строка, содержащая русскоязычное ФИО.
 * Фамилия, имя и отчество должны начинаться с прописной буквы и быть разделены пробелами.
 * Фамилия может быть двойной и писаться через дефис (каждая часть фамилии начинается с прописной буквы).
 * Если строка валидна – верните ФИО, обернутое в класс «Полное имя», содержащий фамилию, имя и отчество.
 * Если невалидна – бросьте из метода исключение, указывающее на ошибку валидации.
 *
 * @author Alexandr Korovkin
 */
public class Main {
    public static void main(String[] args) throws ValidateException {
        FullName myName;

        myName = FullNameValidator.validateFullName("СалтыковЩедрин Михаил Евграфович");

        System.out.println(myName);

    }
}
