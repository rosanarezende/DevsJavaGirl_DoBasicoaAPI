package br.com.djg.emprestalivrospring.repositorio;

import br.com.djg.emprestalivrospring.dominio.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
