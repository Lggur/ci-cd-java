package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class TextAnalyzer {

    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    public String longestWord(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        return Arrays.stream(text.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String normalized = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "")
                .toLowerCase();

        return new StringBuilder(normalized)
                .reverse()
                .toString()
                .equals(normalized);
    }
}
