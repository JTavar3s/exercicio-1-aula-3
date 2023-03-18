public class Restaurante {

    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores = new Fornecedor[3];

    void exibirInfos(){

        System.out.println("CNPJ: " + cnpj);
        System.out.println("endereço: " + endereco);
        System.out.println("nome: " + nome);

        for(int i = 0; i < fornecedores.length;i++){
            if(fornecedores[i] != null){

                System.out.println(fornecedores[i].quantidade);
                System.out.println(fornecedores[i].tipo);
            }

        }

    }

}
