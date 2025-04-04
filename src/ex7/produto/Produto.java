package ex7.produto;

import ex7.fornecedor.*;
// o asterisco é usado pra importar todas as classes de um pacote

public class Produto {
    private String nome;
    private double valor;
    private int quantia;
    private Fornecedor fornecedor;

    public Produto(String nome, double valor, int quantia, Fornecedor fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.quantia = quantia;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() { return valor; }

    public Fornecedor getFornecedor() { return fornecedor; }

    public int getQuantia() { return quantia; }
}