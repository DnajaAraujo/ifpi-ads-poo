public class DecimalNumber {
    double myDouble;
    
    public int exibirInteira() {
        int myInt = (int) myDouble;
        return myInt;
    }

    public double exibirDecimal() {
        double myDecimal = myDouble % 1;
        return myDecimal;
    }

}