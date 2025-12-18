package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {

    private final TextAnalyzer analyzer = new TextAnalyzer();

    @Test
    void countWords_normalText() {
        assertEquals(2, analyzer.countWords("Hello world"));
    }

    @Test
    void countWords_emptyString() {
        assertEquals(0, analyzer.countWords(""));
    }

    @Test
    void countWords_null() {
        assertEquals(0, analyzer.countWords(null));
    }

    @Test
    void countCharacters_normalText() {
        assertEquals(11, analyzer.countCharacters("Hello world"));
    }

    @Test
    void longestWord_normalText() {
        assertEquals("consectetur",
                analyzer.longestWord("Lorem ipsum dolor sit amet, consectetur"));
    }

    @Test
    void longestWord_emptyText() {
        assertEquals("", analyzer.longestWord(""));
    }

    @Test
    void isPalindrome_trueCase() {
        assertTrue(analyzer.isPalindrome("А роза упала на лапу Азора"));
    }

    @Test
    void isPalindrome_falseCase() {
        assertFalse(analyzer.isPalindrome("Hello world"));
    }

    @Test
    void isPalindrome_null() {
        assertFalse(analyzer.isPalindrome(null));
    }
}
