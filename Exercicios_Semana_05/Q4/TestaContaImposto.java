package exercicios.poo05.q04;

public class TestaContaImposto {

    public static void main(String[] args) {
        
        ContaImposto c1 = new ContaImposto("1", 1000);

        System.out.println(c1.getSaldo());
        c1.creditar(100);
        c1.debitar(200);
        System.out.println(c1.getSaldo());
        c1.debitar(200);
        c1.debitar(200);
        //c1.retemImposto(200);
        System.out.println(c1.getSaldo());
        
    }
}