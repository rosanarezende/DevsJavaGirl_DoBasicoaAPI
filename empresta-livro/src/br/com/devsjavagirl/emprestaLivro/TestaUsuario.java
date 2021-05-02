package br.com.devsjavagirl.emprestaLivro;

import br.com.devsjavagirl.emprestaLivro.dominio.Emprestimo;
import br.com.devsjavagirl.emprestaLivro.dominio.Livro;
import br.com.devsjavagirl.emprestaLivro.dominio.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestaUsuario {
    public static void main(String[] args) {
        Usuario rosana = new Usuario("Rosana Rezende", "11/03/1987", "Avenida Tal");
        // rosana.imprimeDadosDoUsuario();

        Livro hpCalice = new Livro("Harry Potter e o Cálice de Fogo", "J. K. Rowling ");
        // hpCalice.imprimeDadosDoLivro();

        Scanner scanner = new Scanner(System.in);
        String dataEmprestimo = "";
        String dataDevolucao = "";
        boolean invalido = true;

        while (invalido) {
            System.out.println("Digite a data do empréstimo: ");
            dataEmprestimo = scanner.nextLine();

            System.out.println("Digite a data da devolução: ");
            dataDevolucao = scanner.nextLine();

            LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
            LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);
            // o formato é YYYY-MM-DD

            // se tivesse q colocar um número mínimo de dias usa o plus date
            if(localDateDevolucao.isBefore(localDateEmprestimo)){
                invalido = true;
                System.out.println("A data de devolução deve ser maior do que a data de empréstimo.\n");
            } else {
                invalido = false;
                System.out.println("Sua solicitação foi efetuada com sucesso.\n");
            }
        }

        Emprestimo emprestimo1 = new Emprestimo(rosana, hpCalice, dataEmprestimo, dataDevolucao);
        emprestimo1.imprimeDadosDoEmprestimo();

    }
}
