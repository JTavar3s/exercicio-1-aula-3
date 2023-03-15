public class Material {
      int codigoSerie;
      String codigoProduto;
       String nome;
       String categoria;
       int quantidade;

        public Material(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
            this.codigoSerie = codigoSerie;
            this.codigoProduto = codigoProduto;
            this.nome = nome;
            this.categoria = categoria;
            this.quantidade = quantidade;
        }

        public void mostraInfo() {
            System.out.println("Código de série: " + codigoSerie);
            System.out.println("Código do produto: " + codigoProduto);
            System.out.println("Nome: " + nome);
            System.out.println("Categoria: " + categoria);
            System.out.println("Quantidade: " + quantidade);
        }

}
