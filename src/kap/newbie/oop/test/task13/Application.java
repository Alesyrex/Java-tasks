package kap.newbie.oop.test.task13;

import kap.newbie.oop.test.task13.controller.FileManager;
import kap.newbie.oop.test.task13.model.FileType;
import kap.newbie.oop.test.task13.model.MyFile;

import java.io.FileNotFoundException;

/**
 * Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
 *
 * Реализуйте класс «Файл» содержит название файла, его размер и тип информации
 * (Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).
 *
 * Реализуйте механизм поиска по файлам. Метод, реализующий поиск должен выбрасывать FileNotFoundException,
 * если файл не найден (вне зависимости от варианта задачи).
 * Если файл с названием, введенным пользователем с клавиатуры, существует – вывести на экран информацию о нем
 * (допустимо использовать переопределенный toString()). Если нет, то:
 *
 * Вариант 1: выведите сообщение «Искомый файл не существует»;
 *
 * Вариант 2: выбросьте исключение FileNotFoundException. Подсказка: throws можно использовать в том числе в main().
 *
 * @author Alexandr Korovkin
 */

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        FileManager manager = new FileManager(createFiles());

        MyFile searchingFile = new MyFile("Numb", 16000, FileType.AUDIO);
//        manager.addFile(searchingFile);
        System.out.println(manager.findFile(searchingFile).toString());
//        try{
//            manager.findFileByName("Linking");
//        } catch (FileNotFoundException exception) {
//            System.out.println(exception.getMessage());
//        }
    }

    private static MyFile[] createFiles(){
        return new MyFile[]{ new MyFile("Document",400, FileType.TEXT),
                new MyFile("Movie",400000,FileType.VIDEO),
                new MyFile("Faint", 15000, FileType.AUDIO),
                new MyFile("Screenshot",1300, FileType.IMAGE),
                new MyFile("windows", 2500, FileType.SYSTEM) };
    }
}
