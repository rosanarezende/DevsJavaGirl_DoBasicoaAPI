package br.com.djg.emprestalivrospring.servico;

import br.com.djg.emprestalivrospring.dominio.Emprestimo;
import br.com.djg.emprestalivrospring.repositorio.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataDevolucao.isBefore(dataEmprestimo)){
            return false;
        }
        return true;
    }

    public void salvaEmprestimo(Emprestimo emprestimo){
        if (validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
            emprestimoRepository.save(emprestimo);
        } else throw new IllegalArgumentException("Data de devolução é menor que a data do empréstimo");
    }
}
