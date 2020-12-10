public class Desconto {

    double valorProduto;
    int desc;

    public double calcula(){
        double valorCalculado = valorProduto - ((valorProduto/100) * desc);
        return valorCalculado;
    }
    
}