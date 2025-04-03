package ex7.util;
import ex7.fornecedor.Fornecedor;
import ex7.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;


public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[5];
    private Produto[] produto = new Produto[2*fornecedor.length];
    private int indexFornecedor = 0;
    private int indexProduto = 0;

    public void menu() {
        int opcao;
        String aux = "1. Cadastrar produto\n";
        aux += "2. Pesquisar produto\n";
        aux += "3. Pesquisar fornecedor\n";
        aux += "4. Finalizar";

        while (true) {
            opcao = parseInt(showInputDialog(aux));

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    return; // o return sem nada simplesmente finalizará o método
                default:
                    showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }

    public void cadastrarProduto() {
        // caracteristicas do produto
        String nome;
        int quantia; // qtd em estoque
        double valor;
        Fornecedor fornecedor = pesquisarFornecedor();

        if (fornecedor == null) {
            fornecedor = cadastrarFornecedor();
        }

        nome = showInputDialog("Digite o nome do produto");
        valor = parseDouble(showInputDialog("Digite o valor do produto"));
        quantia = parseInt(showInputDialog("Digite a quantia do produto no estoque"));
        produto[indexProduto++] = new Produto(nome, valor, quantia, fornecedor);
    }

    public Fornecedor cadastrarFornecedor() {
        String nome = showInputDialog("Digite o nome do fornecedor");
        long cnpj = parseLong(showInputDialog("Digite o CNPJ do fornecedor a ser cadastrado"));
        fornecedor[indexFornecedor] = new Fornecedor(nome, cnpj);
        return fornecedor[indexFornecedor++];
    }

    public void pesquisar() {
        Fornecedor fornecedor = pesquisarFornecedor();

        if(fornecedor != null) {
            showMessageDialog(null, fornecedor.getCnpj() + "\n" + fornecedor.getNome());
        }
    }

    public void pesquisarProduto() {
        String aux = "Produto não encontrado.";
        String nome = showInputDialog("Nome do produto:");

        for (int i = 0; i < indexProduto; i++) {
            if (produto[i].getNome().equalsIgnoreCase(nome)) {
                aux = "\nNome do produto: " + nome;
                aux += "\nValor do produto: " + produto[i].getValor();
                aux += "\nQuantidade do produto em estoque: " + produto[i].getQuantia();
                aux += "\nFornecedor: " + produto[i].getFornecedor().getNome();
                break;
            }
        }
        showMessageDialog(null, aux);
    }

    public Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("Digite o CNPJ do fornecedor: "));
        for (int i = 0; i < indexFornecedor; i++) {
            if(fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, "CNPJ de número: " + cnpj + " não encontrado");

        return null;
    }
}
