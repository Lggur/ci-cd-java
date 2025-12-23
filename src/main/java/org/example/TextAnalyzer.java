package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Comparator;

public class TextAnalyzer {

    public int countWords(String text) {
        if (StringUtils.isBlank(text)) {
            return 0;
        }
        return StringUtils.split(text).length;
    }

    public int countCharacters(String text) {
        return StringUtils.defaultString(text).length();
    }

    public String longestWord(String text) {
        if (StringUtils.isBlank(text)) {
            return "";
        }

        return Arrays.stream(StringUtils.split(text))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public boolean isPalindrome(String text) {
        if (StringUtils.isBlank(text)) {
            return false;
        }

        String normalized = text.replaceAll("[^a-zA-Zа-яА-Я0-9]", "")
                .toLowerCase();

        return StringUtils.reverse(normalized).equals(normalized);
    }

    public TextAnalysisResult analyze(String text) {
        return new TextAnalysisResult(
                countWords(text),
                countCharacters(text),
                longestWord(text),
                isPalindrome(text)
        );
    }
}