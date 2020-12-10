public class TestaEquipamentos {

    public static void main(String[] args) {
        
        Equipamento ventilador = new Equipamento();
        Equipamento tv = new Equipamento();

        ventilador.ligado = true;
        tv.ligado = false;

        ventilador.inverte();
        tv.inverte();

        if (ventilador.estaLigado() == true) {
            System.out.println("Ventilador esta ligado");
        } 
        else {
            System.out.println("Ventilador esta desligado");
        }
        if (tv.estaLigado() == true) {
            System.out.println("TV esta ligada");
        } 
        else {
            System.out.println("TV esta desligada");
        }

    }
    
}