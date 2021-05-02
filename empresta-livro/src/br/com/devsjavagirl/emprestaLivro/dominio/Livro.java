package br.com.devsjavagirl.emprestaLivro.dominio;

public class Livro {
    static int codigoDoLivro;
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        Livro.codigoDoLivro++;
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimeDadosDoLivro(){
        System.out.printf("Código do livro: %d. \nNome do livro:  %s. \nNome do autor:  %s. \n", this.codigoDoLivro, this.nome, this.autor);
    }
}
