public class Fornecedor {
    private String nome;
    private long cnpj;

    // criação de um construtor (método que cria os valores padrão para as variáveis)
    public Fornecedor(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
