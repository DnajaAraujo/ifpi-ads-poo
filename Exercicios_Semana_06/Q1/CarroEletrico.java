public class CarroEletrico extends Carro{
    int autonomiaBateria;

    public CarroEletrico(int autonomiaBateria, String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        this.autonomiaBateria = autonomiaBateria;
    }
    
}