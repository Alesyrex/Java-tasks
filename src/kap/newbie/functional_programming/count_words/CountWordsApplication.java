package kap.newbie.functional_programming.count_words;

import kap.newbie.functional_programming.count_words.model.Words;

import java.util.List;

/**
 * Implement method in Words.java class.
 * Input parameter is a list of strings representing lines of text.
 * Count words - map lowercased words to its frequency in text.
 * If the word "котик" occurred in text 23 times then its entry would be "котик - 23\n".
 * Omit any word with length less than 4 and frequency less than 10 (like too small or too rare words)
 *
 * Return a String having all the entries.
 * Entries in the resulting String should be also sorted by amount and then in alphabetical order if needed.
 *
 * You may not use conditional statements and cycles in your code (that is right, no if , for , while , etc.)
 *
 * @author Alexandr Korovkin
 */
public class CountWordsApplication {
    public static void main(String[] args) {
        List<String> list = List.of("Клара у карла украла кораллы а карла у клара",
                "Сколько лет пройдет все о том же гудят и гудят кораллы кораллы кораллы",
                "И это пройдет пройдет Пройдет ПройДет",
                "Алиса алиса где куда потифон?",
                "Куда смотрят смотрят смотрят смотрят наши власти");

        Words words = new Words();

        System.out.println(words.countWords(list));
    }
}
