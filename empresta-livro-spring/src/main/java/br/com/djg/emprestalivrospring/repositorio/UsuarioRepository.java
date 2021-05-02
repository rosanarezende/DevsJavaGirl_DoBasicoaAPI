package br.com.djg.emprestalivrospring.repositorio;

import br.com.djg.emprestalivrospring.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
