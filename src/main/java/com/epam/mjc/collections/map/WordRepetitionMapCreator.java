package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> hashMap = new HashMap<>();

        if (!sentence.isEmpty()) {
            String key = sentence.toLowerCase(Locale.ROOT);
            String[] words = key.split("[^a-z]+");
            for (String s : words) {
                hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
            }
        }

        return hashMap;
    }
}
