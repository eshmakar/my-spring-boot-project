package eshmakar.ru.myspringbootproject;

import java.math.BigInteger;

public class PowXpow {

    public Object powXpow(int number, int number2) {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        s.append(new BigInteger(String.valueOf(number)).pow(number2));
        long stop = System.currentTimeMillis();
        int lenght = s.length();

        Object o = number + " в степени " + number2 + "<br>" + "Кол-во цифр: " + lenght + "<br>" + "Выполнено за: " + (double) (stop - start) / 1000 + " сек, или за " + (double) (stop - start) / 1000 / 60 + " мин";
//        Object o = number + " в степени " + number2 + "<br>" + s + "<br>" + "Кол-во цифр: " + lenght + "<br>" + "Выполнено за: " + (double) (stop - start) / 1000 + " сек, или за " + (double) (stop - start) / 1000 / 60 + " мин";
        return  o;
    }
}