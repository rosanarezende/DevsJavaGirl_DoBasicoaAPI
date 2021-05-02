package br.com.djg.emprestalivrospring.repositorio;

import br.com.djg.emprestalivrospring.dominio.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
