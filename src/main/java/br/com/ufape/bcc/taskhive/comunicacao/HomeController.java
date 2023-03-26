package br.com.ufape.bcc.taskhive.comunicacao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String teste() {
        return "Bem-vindo ao meu projeto Spring! ";
    }
}

