public class Main {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor();

        Restaurante restaurante = new Restaurante();
        restaurante.fornecedores[0] = new Fornecedor();

        restaurante.fornecedores[0].quantidade = 2;
        restaurante.fornecedores[0].tipo = "vendedor";

        restaurante.nome = "bar do bá";
        restaurante.endereco = "aaaaaaaaaaa";
        restaurante.cnpj = "222222222";

        restaurante.exibirInfos();



    }


}