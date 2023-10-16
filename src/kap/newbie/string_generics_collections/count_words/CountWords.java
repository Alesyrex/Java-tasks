package kap.newbie.string_generics_collections.count_words;

import kap.newbie.string_generics_collections.count_words.model.Words;

import java.util.List;

/**
 * @author Alexandr Korovkin
 */
public class CountWords {
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
