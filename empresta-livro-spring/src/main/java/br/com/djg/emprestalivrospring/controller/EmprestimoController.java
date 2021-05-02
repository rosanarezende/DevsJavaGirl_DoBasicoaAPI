package br.com.djg.emprestalivrospring.controller;

import br.com.djg.emprestalivrospring.dominio.Emprestimo;
import br.com.djg.emprestalivrospring.servico.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping("/emprestimo")
    public void salvaEmprestimo(@RequestBody Emprestimo emprestimo){
        emprestimoService.salvaEmprestimo(emprestimo);
    }

}
