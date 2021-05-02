package br.com.djg.emprestalivrospring.controller;

import br.com.djg.emprestalivrospring.dominio.Livro;
import br.com.djg.emprestalivrospring.servico.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public void salvaLivro(@RequestBody Livro livro){
        livroService.salvaLivro(livro);
    }
}
