public class Main {
    public static void main(String[] args) {

        Motor motor1 = new Motor(150.0, "Gasolina");
        Carro carro1 = new Carro("Preto", "Chevrolet", "Cruze", 200.0, 0.0, motor1);

        Motor motor2 = new Motor(120.0, "Etanol");
        Carro carro2 = new Carro("Branco", "Fiat", "Palio", 180.0, 0.0, motor2);

        carro1.ligar();
        carro1.acelerar();
        carro1.mostraInfo();

        carro2.ligar();
        carro2.acelerar();
        carro2.mostraInfo();
    }
    }
}