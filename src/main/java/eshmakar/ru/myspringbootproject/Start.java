package eshmakar.ru.myspringbootproject;

public class Start {

    public static final char dm = (char) 34;
    public  static final String blank = "_blank";
    public  static final String URL = "localhost:8080/";
    public static final String glavnayaStranica = "<p><a href=" + dm + "localhost:8080/" + dm + " target=" + dm + blank + dm + ">" + "На главную" + "</a></p>";

    StringBuilder sbb() {
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=").append(dm).append(URL + "random/").append(dm).append(">").append("Рандомные сайты").append("</a><br>" +
                "<a href=").append(dm).append(URL + "hello/").append(dm).append(">").append("hello").append("</a><br>" +
                "<a href=").append(dm).append(URL + "for/1-100/").append(dm).append(">").append("Диапазон цифр").append("</a><br>" +
                "<a href=").append(dm).append(URL + "55/").append(dm).append(">").append("Степень введенного числа на самого себя").append("</a><br>" +
                "<a href=").append(dm).append(URL + "pow/12x5/").append(dm).append(">").append("Ручное указывание степени и числа").append("</a><br>" +
                "<a href=").append(dm).append(URL + "reverse/Текст").append(dm).append(">").append("Текст наоборот").append("</a><br>" +
                "<a href=").append(dm).append(URL + "case/helLo/").append(dm).append(">").append("Текст с прописными, ЗАГЛАВНЫМИ буквами").append("</a><br>");
        return sb;
    }

}
