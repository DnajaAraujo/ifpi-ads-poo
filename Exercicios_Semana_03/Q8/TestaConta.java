public class TestaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1", 100);
        Conta conta2 = new Conta("2", 100);

        conta1 = conta2;
        
        conta1.sacar(10);
        conta1.transferir(conta2, 50);

        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

    }
}