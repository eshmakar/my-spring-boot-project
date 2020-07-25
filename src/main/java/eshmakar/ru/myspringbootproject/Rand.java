package eshmakar.ru.myspringbootproject;

import java.util.Random;

public class Rand {

    public String randd() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4; //длина текста
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        String site = "http://" + generatedString + ".ru"; //переобразует в ссылку
        String blank = "_blank";

        char dm = (char) 34; // символ двойные кавычки, чтобы составить html тег

        return "<p><a href=" + dm + site + dm + " target=" + dm + blank + dm + ">" + site + "</a></p>"; //пишет название сайта, при нажатии открывает сайт в новый вкладке
    }
}
