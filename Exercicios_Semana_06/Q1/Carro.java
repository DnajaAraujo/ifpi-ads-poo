public class Carro extends Veiculo{
    String modelo;

    public Carro(String modelo, String placa, int ano) {
        super(placa, ano);
        this.modelo = modelo;
    }
    
}