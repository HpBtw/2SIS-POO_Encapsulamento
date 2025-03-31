package exemplo;

public class Produto {
    private String nome;
    private double valor;
    private int quantia;
    private Fornecedor fornecedor;

    public Produto (String nome, double valor, int quantia){
        this.nome = nome;
        this.valor = valor;
        this.quantia = quantia;
        this.fornecedor = fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
