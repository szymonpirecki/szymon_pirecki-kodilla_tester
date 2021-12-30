package com.kodila.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
englishWords.add(englishWord);
dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords (String polishWord){
        return Collections.emptyList();
    }

    public List<EnglishWord> findEnglishWords (String polishWord, PartOfSpeach partOfSpeach){
        return Collections.emptyList();
    }
    public int size(){
        return dictionary.size();
    }
}