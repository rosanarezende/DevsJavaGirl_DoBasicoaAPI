package br.com.djg.emprestalivrospring.servico;

import br.com.djg.emprestalivrospring.dominio.Livro;
import br.com.djg.emprestalivrospring.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void salvaLivro(Livro livro){
        livroRepository.save(livro);
    }
}
