public class TestaDesconto {
    public static void main(String[] args) {
        Desconto d = new Desconto();

        d.valorProduto = 120;
        d.desc = 10;

        System.out.println(d.calcula());
    }    
}