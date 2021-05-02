package br.com.devsjavagirl.emprestaLivro.dominio;

public class Emprestimo {
    static int codigoDaSolicitacao;
    private Usuario usuario;
    private Livro livro;
    private String dataDaSolicitacao;
    private String dataDaDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, String dataDaSolicitacao, String dataDaDevolucao) {
        Emprestimo.codigoDaSolicitacao++;
        this.usuario = usuario;
        this.livro = livro;
        this.dataDaSolicitacao = dataDaSolicitacao;
        this.dataDaDevolucao = dataDaDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataDaSolicitacao() {
        return dataDaSolicitacao;
    }

    public void setDataDaSolicitacao(String dataDaSolicitacao) {
        this.dataDaSolicitacao = dataDaSolicitacao;
    }

    public String getDataDaDevolucao() {
        return dataDaDevolucao;
    }

    public void setDataDaDevolucao(String dataDaDevolucao) {
        this.dataDaDevolucao = dataDaDevolucao;
    }

    public void imprimeDadosDoEmprestimo(){
        System.out.printf("Código da solicitação: %d.\n", this.codigoDaSolicitacao);
        this.usuario.imprimeDadosDoUsuario();
        this.livro.imprimeDadosDoLivro();
        System.out.printf("Data da solicitação:  %s., \nData da devolução:  %s. \n", this.dataDaSolicitacao, this.dataDaDevolucao);
    }
}
