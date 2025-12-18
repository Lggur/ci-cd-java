package org.example;

public class App {

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "А роза упала на лапу азора";

        System.out.println("Количество слов: " + analyzer.countWords(text));
        System.out.println("Количество символов: " + analyzer.countCharacters(text));
        System.out.println("Самое длинное слово: " + analyzer.longestWord(text));
        System.out.println("Является палиндромом: " + analyzer.isPalindrome(text));
    }
}
