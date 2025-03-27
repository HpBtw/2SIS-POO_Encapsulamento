public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Nome", 255255);
        // metodo para pegar uma variavel encapsulada
        System.out.println(fornecedor.getNome());

        // metodo para redesignar uma variavel encapsulada
        fornecedor.setNome("NomeAlterado");
        System.out.println(fornecedor.getNome());
    }
}
