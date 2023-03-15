public class Main {
    public static void main(String[] args) {

        Material material1 = new Material(123, "PROD001", "Camiseta", "Vestuário", 50);
        Material material2 = new Material(456, "PROD002", "Notebook", "Eletrônicos", 10);

        material1.mostraInfo();
        System.out.println();
        material2.mostraInfo();


    }
}