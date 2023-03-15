public class Carro {

    private String cor;
    private String marca;
    private String modelo;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private Motor motor;

    public Carro(String cor, String marca, String modelo, double velocidadeMaxima, double velocidadeAtual, Motor motor) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.motor = motor;
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void mostraInfo() {
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println("Potência do Motor: " + motor.getPotencia());
        System.out.println("Tipo do Motor: " + motor.getTipo());
    }
}
