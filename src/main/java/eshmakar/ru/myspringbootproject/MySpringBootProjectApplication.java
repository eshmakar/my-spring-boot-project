package eshmakar.ru.myspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

import static eshmakar.ru.myspringbootproject.Start.glavnayaStranica;

@SpringBootApplication //означает что этот класс является spring - говским
@RestController // без этого контроллера не работает
public class MySpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootProjectApplication.class, args); //всегда необходимо так запускать Spring приложения
    }


    @RequestMapping(value = "/") //при переходе на localhost:8080/ - выводит это сообщение
    public StringBuilder greeting() {
        return new Start().sbb();

    }

    @GetMapping("/hello") //при открытий localhost:8080//hello
    public String hello(@RequestParam(value = "name", defaultValue = "World!") String name) {
        return String.format(glavnayaStranica + "Hello %s!", name); //выводит "Hello World!"
    }


    //РАБОЧИЙ КОД
    @GetMapping(value = "/for/{nu}" + "-" + "{nu2}") //при написании любых цифр, например localhost:8080//100
    public Object c0(@PathVariable long nu, @PathVariable long nu2) {
        return glavnayaStranica + new For().forEach(nu, nu2);
    }


    //возводит в степень на эту же цифру. Пример http://localhost:8080/155
    @GetMapping(value = "/{num}") //при написании любых цифр, например localhost:8080//100
    public Object c(@PathVariable int num) {
        return glavnayaStranica + new PowToPow().pow(num);
    }

    //возводит в степень. Пример: http://localhost:8080/15x5
    @GetMapping(value = "/pow/{number}" + "x" + "{number2}") //при написании любых цифр, например localhost:8080//100x15
    public Object c2(@PathVariable int number, @PathVariable int number2) {
        return glavnayaStranica + new PowXpow().powXpow(number, number2);
    }


    @GetMapping("/random") //при переходе на random
    public String random() throws URISyntaxException, IOException {
        return glavnayaStranica + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd()
                + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd() + new Rand().randd();
        //выводится рандомные сайты

/*
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 4;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        String site = "http://" + generatedString + ".com";
        String blank = "_blank";

        String mail = "http://mail.ru";
        char dm = (char) 34;

//        return "<a href=" + site + " target=" + blank + ">" + site + "</a>";
//        return "<a href=" + site + " target=" + blank + ">" + site + "</a>" + " <meta http-equiv=" + dm + "refresh"+ dm+ " "  + " content=" + dm + "2000000;" + site + dm + ">";

        return "<p><a href=" +dm + site + dm+ " target=" +dm + blank + dm+  ">" + site + "</a></p>" + " <br>";*/

    }

    @GetMapping(value = "/reverse/{name}")
    public String reverse(@PathVariable StringBuffer name) {
        StringBuffer stringBuffer = new StringBuffer(name);
        StringBuffer stringBuffer2 = new StringBuffer(name);
        return "Исходный текст: " + "<br>" + stringBuffer + "<br>" + "<br>" + "<br>" + "Текст наоборот (reverse): " + "<br>" + stringBuffer2.reverse();
    }


    @GetMapping(value = "/case/{name}")
    public String casee(@PathVariable String name) {
        String text = name;
        return "Исходный текст: " + "<br>" + text + "<br>" + "<br>" + "<br>" + "прописные буквы: " + "<br>" + text.toLowerCase() + "<br>" + "<br>" + "<br>" + "ЗАГЛАВНЫЕ БУКВЫ: " + "<br>" + text.toUpperCase();
    }

}