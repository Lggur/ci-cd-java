package org.example;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {


        String text = "А роза упала на лапу Азора";

        logger.info("Анализ начинается");
        logger.debug("Входной текст: {}", text);

        TextAnalyzer analyzer = new TextAnalyzer();
        TextAnalysisResult result = analyzer.analyze(text);

        Gson gson = new Gson();
        String jsonResult = gson.toJson(result);

        logger.info("Анализ завершён");
        logger.info("Результат (JSON): {}", jsonResult);
    }
}
