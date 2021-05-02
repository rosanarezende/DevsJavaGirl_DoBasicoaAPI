package br.com.djg.emprestalivrospring.controller;

import br.com.djg.emprestalivrospring.dominio.Usuario;
import br.com.djg.emprestalivrospring.servico.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public void salvaUsuario(@RequestBody Usuario usuario){
        usuarioService.salvaUsuario(usuario);
    }
}
