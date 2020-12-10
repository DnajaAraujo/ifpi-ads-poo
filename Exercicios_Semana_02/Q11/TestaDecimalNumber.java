public class TestaDecimalNumber {
    public static void main(String[] args) {
        DecimalNumber dn = new DecimalNumber();

        dn.myDouble = 24.52;

        System.out.println(dn.exibirInteira());
        System.out.println(dn.exibirDecimal());
    }
}