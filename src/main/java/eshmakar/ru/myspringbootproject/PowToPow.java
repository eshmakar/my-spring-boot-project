package eshmakar.ru.myspringbootproject;

import java.math.BigInteger;


//возводит в степень на эту же цифру. Пример http://localhost:8080/155
public class PowToPow {
    public Object pow(int num) {
        long start0 = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        s.append(new BigInteger(String.valueOf(num)).pow(num));
        long stop0 = System.currentTimeMillis();
        int lenght0 = s.length();
        Object o = num + " в степени " + num + "<br>" + s + "<br>" + "Кол-во цифр: " + lenght0 + "<br>" + "Выполнено за: " + (double) (stop0 - start0) / 1000 + " сек, или за " + (double) (stop0 - start0) / 1000 / 60 + " мин";
        return o;
    }
}