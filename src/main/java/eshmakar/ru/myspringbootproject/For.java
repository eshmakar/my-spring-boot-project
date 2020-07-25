package eshmakar.ru.myspringbootproject;

public class For {
    public Object forEach(long nu, long nu2){
        StringBuilder s = new StringBuilder();
        if (nu<nu2) {
            for (long i = nu; i <= nu2; i++) {
                s.append(String.format(i + "<br>")); //выводит диапазон цифр от 1 - до 100
            }
        }else for (long i = nu; i >= nu2; i--) {
            s.append(String.format(i + "<br>"));
        }
        return s;
    }
}
