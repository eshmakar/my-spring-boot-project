package eshmakar.ru.myspringbootproject.controller;

import eshmakar.ru.myspringbootproject.For;
import eshmakar.ru.myspringbootproject.PowToPow;
import eshmakar.ru.myspringbootproject.PowXpow;
import eshmakar.ru.myspringbootproject.Rand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URISyntaxException;

import static eshmakar.ru.myspringbootproject.Start.glavnayaStranica;


@Controller
public class Contr {
    @RequestMapping
    public String homePage() {
        return "index";
    }



    @GetMapping("hello")
    public String returnHello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("variable1", name + "!");
        return "hello";
    }

    @GetMapping(value = "/{num}")
    public String returnPow(@PathVariable int num, Model model){
        model.addAttribute("powResult", new PowToPow().pow(num));
        return "pow";
    }


    /*//СТАРЫЙ КОД
    //РАБОЧИЙ КОД
    @GetMapping(value = "/for/{nu}" + "-" + "{nu2}") //диапазон цифр, например localhost:8080//100-500
    public Object c0(@PathVariable long nu, @PathVariable long nu2) {
        return new For().forEach(nu, nu2);
    }*/
    @GetMapping(value = "/for/{nu}" + "-" + "{nu2}")
    public String returnDiapason(@PathVariable long nu, @PathVariable long nu2, Model model){
        model.addAttribute("returnDiapason", new For().forEach(nu, nu2));
        return "for";
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