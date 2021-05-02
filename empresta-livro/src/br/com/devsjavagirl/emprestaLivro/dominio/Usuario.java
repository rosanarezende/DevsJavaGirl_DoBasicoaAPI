package br.com.devsjavagirl.emprestaLivro.dominio;

public class Usuario {
    static int codigoDoUsuario;
    private String nomeCompleto;
    private String dataDeNascimento;
    private String endereco;

    public Usuario(String nomeCompleto, String dataDeNascimento, String endereco) {
        Usuario.codigoDoUsuario++;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimeDadosDoUsuario(){
        System.out.printf("Código do usuário: %d. \nNome completo:  %s. \nData de nascimento:  %s. \nEndereço:  %s. \n",
        this.codigoDoUsuario, this.nomeCompleto, this.dataDeNascimento, this.endereco);
    }
}
