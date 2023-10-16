package com.ambev.pratico2.exceptions;

import com.ambev.pratico2.exceptions.CustomNotFoundException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/nome/{nome}")
    public String nome(@PathVariable String nome){
        if("erro".equals(nome)){
            throw new CustomNotFoundException("Erro no serviço!");
        }
        return "Olá," + nome + "!";
    }
    @GetMapping("/generic")
    public String generic() throws Exception{
        throw new Exception("500 (Internal Server Error)");
    }
}
