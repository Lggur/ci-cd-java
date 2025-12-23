package org.example;

public class TextAnalysisResult {

    private final int wordCount;
    private final int characterCount;
    private final String longestWord;
    private final boolean palindrome;

    public TextAnalysisResult(int wordCount, int characterCount,
                              String longestWord, boolean palindrome) {
        this.wordCount = wordCount;
        this.characterCount = characterCount;
        this.longestWord = longestWord;
        this.palindrome = palindrome;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public boolean isPalindrome() {
        return palindrome;
    }
}