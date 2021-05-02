package br.com.djg.emprestalivrospring.servico;

import br.com.djg.emprestalivrospring.dominio.Usuario;
import br.com.djg.emprestalivrospring.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
